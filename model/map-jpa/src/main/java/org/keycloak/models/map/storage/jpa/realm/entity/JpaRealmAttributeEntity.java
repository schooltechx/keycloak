/*
 * Copyright 2022 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
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
package org.keycloak.models.map.storage.jpa.realm.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.keycloak.models.map.storage.jpa.JpaAttributeEntity;

/**
 * JPA implementation for realm attributes. This entity represents a realm attribute and has a many-to-one relationship
 * with the realm entity.
 *
 * @author <a href="mailto:sguilhen@redhat.com">Stefan Guilhen</a>
 */
@Entity
@Table(name = "kc_realm_attribute")
public class JpaRealmAttributeEntity extends JpaAttributeEntity<JpaRealmEntity> {

    public JpaRealmAttributeEntity() {
    }

    public JpaRealmAttributeEntity(final JpaRealmEntity root, final String name, final String value) {
        super(root, name, value);
    }
}
