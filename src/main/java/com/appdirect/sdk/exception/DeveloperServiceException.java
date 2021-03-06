/*
 * Copyright 2017 AppDirect, Inc. and/or its affiliates
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.appdirect.sdk.exception;

import static com.appdirect.sdk.appmarket.events.APIResult.failure;

import lombok.Getter;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.ErrorCode;

public class DeveloperServiceException extends RuntimeException {
	private static final long serialVersionUID = 6079855456255852065L;

	@Getter
	private final APIResult result;

	public DeveloperServiceException(String message) {
		super(message);
		this.result = new APIResult(false, message);
	}

	public DeveloperServiceException(ErrorCode errorCode, String message) {
		super(message);
		this.result = failure(errorCode, message);
	}
}
