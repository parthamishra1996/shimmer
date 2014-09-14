/*
 * Copyright 2014 Open mHealth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openmhealth.shim;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Danilo Bonilla
 */
@Repository
public interface AccessParametersRepo extends MongoRepository<AccessParameters, String> {

    AccessParameters findByUsernameAndShimKey(String username, String shimKey, Sort sort);

    List<AccessParameters> findAllByUsernameAndShimKey(String username, String shimKey);

    List<AccessParameters> findAllByUsernameLike(String username);
}
