// Copyright 2022 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0

package org.terasology.engine.integrationenvironment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.terasology.engine.integrationenvironment.extension.Dependencies;
import org.terasology.engine.integrationenvironment.fixtures.BaseTestingClass;

@Tag("MteTest")
@ExtendWith(MTEExtension.class)
@Dependencies({"engine", "ModuleTestingEnvironment"})
public class SubclassInjectionTest extends BaseTestingClass {
    @Test
    public void testInjection() {
        // ensure the superclass's private fields were injected correctly
        Assertions.assertNotNull(getEntityManager());
        Assertions.assertNotNull(getHelper());
    }
}
