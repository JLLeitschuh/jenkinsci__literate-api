/*
 * The MIT License
 *
 * Copyright (c) 2013, CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.cloudbees.literate.api.v1.vfs;

import java.io.IOException;

/**
 * Base class for exceptions thrown by a {@link ProjectRepository}.
 */
public class ProjectRepositoryException extends IOException {
    /**
     * {@inheritDoc}
     */
    public ProjectRepositoryException() {
    }

    /**
     * {@inheritDoc}
     */
    public ProjectRepositoryException(Throwable cause) {
        super(cause == null ? null : cause.getMessage());
        initCause(cause);
    }

    /**
     * {@inheritDoc}
     */
    public ProjectRepositoryException(String message) {
        super(message);
    }

    /**
     * {@inheritDoc}
     */
    public ProjectRepositoryException(String message, Throwable cause) {
        super(message);
        initCause(cause);
    }
}
