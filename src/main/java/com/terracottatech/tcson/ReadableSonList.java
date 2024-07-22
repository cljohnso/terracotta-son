/*
 * Copyright Super iPaaS Integration LLC, an IBM Company 2020, 2024
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.terracottatech.tcson;

import com.terracottatech.tcson.reading.ReadableSonValue;

import java.nio.ByteBuffer;

/**
 * A read only, buffer based SonList.
 */
public interface ReadableSonList extends SonList<ReadableSonValue> {

  @Override
  ReadableSonValue asSonValue();

  NameSource getNameSource();

  ByteBuffer toBuffer();

  void toBuffer(ByteBuffer dest);
}
