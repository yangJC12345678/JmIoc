/*
 * Copyright (C) Chris Liao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jmin.ioc.parameter.collection;

import java.util.List;

import org.jmin.ioc.BeanParameterException;

/**
 * 容器类型的Value
 *
 * @author Chris Liao
 * @version 1.0
 */
public final class ListParameter extends CollectionParameter {

  /**
   * Constructor with a IoC description object.
   */
  public ListParameter(List list)throws BeanParameterException {
  	super(list);
  }
}