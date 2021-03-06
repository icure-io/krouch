/*
 *    Copyright 2020 Taktik SA
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package org.taktik.couchdb.exception

open class CouchDbException(message: String, val statusCode: Int, val statusMessage: String, val error: String? = null, val reason: String? = null, val couchDbRequestId: String? = null, val couchDbBodyTime: Long? = null) : RuntimeException(message)

class CouchDbConflictException(message: String, statusCode: Int, statusMessage: String, error: String? = null, reason: String? = null, couchDbRequestId: String? = null, couchDbBodyTime: Long? = null) : CouchDbException(message, statusCode, statusMessage, error, reason, couchDbRequestId, couchDbBodyTime)
