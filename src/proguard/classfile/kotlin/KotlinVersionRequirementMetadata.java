/*
 * ProGuard Core -- library to process Java bytecode.
 *
 * Copyright (c) 2002-2019 Guardsquare NV
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
package proguard.classfile.kotlin;

import kotlinx.metadata.*;
import proguard.classfile.*;
import proguard.classfile.kotlin.visitors.*;
import proguard.util.*;

public class KotlinVersionRequirementMetadata
extends SimpleProcessable
implements Processable
{
    public KmVersionRequirementVersionKind kind;

    public KmVersionRequirementLevel level;

    public Integer errorCode;

    public String message;

    public int major;

    public int minor;

    public int patch;


    public void accept(Clazz                           clazz,
                       KotlinMetadata                  kotlinMetadata,
                       KotlinVersionRequirementVisitor kotlinVersionRequirementVisitor)
    {
        kotlinVersionRequirementVisitor.visitClassVersionRequirement(clazz,
                                                                     kotlinMetadata,
                                                                     this);
    }


    public void accept(Clazz                           clazz,
                       KotlinMetadata                  kotlinMetadata,
                       KotlinConstructorMetadata       kotlinConstructorMetadata,
                       KotlinVersionRequirementVisitor kotlinVersionRequirementVisitor)
    {
        kotlinVersionRequirementVisitor.visitConstructorVersionRequirement(clazz,
                                                                           kotlinMetadata,
                                                                           kotlinConstructorMetadata,
                                                                           this);
    }


    public void accept(Clazz                           clazz,
                       KotlinMetadata                  kotlinMetadata,
                       KotlinFunctionMetadata          kotlinFunctionMetadata,
                       KotlinVersionRequirementVisitor kotlinVersionRequirementVisitor)
    {
        kotlinVersionRequirementVisitor.visitFunctionVersionRequirement(clazz,
                                                                        kotlinMetadata,
                                                                        kotlinFunctionMetadata,
                                                                        this);
    }


    public void accept(Clazz                              clazz,
                       KotlinDeclarationContainerMetadata kotlinDeclarationContainerMetadata,
                       KotlinPropertyMetadata             kotlinPropertyMetadata,
                       KotlinVersionRequirementVisitor    kotlinVersionRequirementVisitor)
    {
        kotlinVersionRequirementVisitor.visitPropertyVersionRequirement(clazz,
                                                                        kotlinDeclarationContainerMetadata,
                                                                        kotlinPropertyMetadata,
                                                                        this);
    }


    public void accept(Clazz                           clazz,
                       KotlinMetadata                  kotlinMetadata,
                       KotlinTypeAliasMetadata         kotlinTypeAliasMetadata,
                       KotlinVersionRequirementVisitor kotlinVersionRequirementVisitor)
    {
        kotlinVersionRequirementVisitor.visitTypeAliasVersionRequirement(clazz,
                                                                         kotlinMetadata,
                                                                         kotlinTypeAliasMetadata,
                                                                         this);
    }


    // Implementations for Object.
    @Override
    public String toString()
    {
        return "Kotlin version req (" + major + "." + minor + "." + patch + ")";
    }
}
