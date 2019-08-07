/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on ant "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.configurationsample.specific;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.configurationsample.ConfigurationProperties;

/**
 * An annotated getter with {@code NotEmpty} that triggers a different class type in the
 * compiler. See #11512
 *
 * @author Stephane Nicoll
 */
@ConfigurationProperties("specific")
public class AnnotatedGetter {

	private String name;

	@NotEmpty
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
