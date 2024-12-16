/*
 * ProActive Parallel Suite(TM):
 * The Open Source library for parallel and distributed
 * Workflows & Scheduling, Orchestration, Cloud Automation
 * and Big Data Analysis on Enterprise Grids & Clouds.
 *
 * Copyright (c) 2007 - 2017 ActiveEon
 * Contact: contact@activeeon.com
 *
 * This library is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation: version 3 of
 * the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * If needed, contact us to obtain a release under GPL Version 2 or 3
 * or a different license than the AGPL.
 */
package org.ow2.proactive.scheduling.api.exceptionhandler;

import org.ow2.proactive.microservices.common.exception.ExceptionHandlerAdvice;
import org.ow2.proactive.scheduling.api.graphql.service.exceptions.InvalidSessionIdException;
import org.ow2.proactive.scheduling.api.graphql.service.exceptions.MissingSessionIdException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.util.concurrent.UncheckedExecutionException;

import lombok.extern.log4j.Log4j2;


@ControllerAdvice
@Log4j2
public class ExceptionHandlerController extends ExceptionHandlerAdvice {

    public ExceptionHandlerController() {
        super(log);
    }

    @ExceptionHandler(InvalidSessionIdException.class)
    public @ResponseBody ResponseEntity<Object> invalidSessionIdExceptionHandler(InvalidSessionIdException e)
            throws Exception {
        return clientErrorHandler(e);
    }

    @ExceptionHandler(MissingSessionIdException.class)
    public @ResponseBody ResponseEntity<Object> invalidSessionIdExceptionHandler(MissingSessionIdException e)
            throws Exception {
        return clientErrorHandler(e);
    }

    @ExceptionHandler(UncheckedExecutionException.class)
    public @ResponseBody ResponseEntity<Object> invalidSessionIdExceptionHandler(UncheckedExecutionException e)
            throws Exception {
        return clientErrorHandler(e);
    }
}
