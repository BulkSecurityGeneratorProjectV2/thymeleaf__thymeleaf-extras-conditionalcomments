/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2012, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.extras.conditionalcomments.dialect;

import java.util.Collections;
import java.util.Set;

import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.extras.conditionalcomments.dialect.processor.ConditionalCommentProcessor;
import org.thymeleaf.processor.IProcessor;



/**
 * 
 * @author Daniel Fern&aacute;ndez
 *
 */
public class ConditionalCommentsDialect extends AbstractDialect {

    public static final String DEFAULT_PREFIX = "condcom";
    
    
    public ConditionalCommentsDialect() {
        super();
    }

    
    
    public String getPrefix() {
        return DEFAULT_PREFIX;
    }

    
    public boolean isLenient() {
        return false;
    }



    
    @Override
    public Set<IProcessor> getProcessors() {
        return Collections.singleton((IProcessor)new ConditionalCommentProcessor());
    }

    
}
