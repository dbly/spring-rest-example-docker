/*
 * Copyright 2015 Karl Bennett
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package example.rest.spring.data;

import static example.rest.spring.data.Addresses.address;
import static example.rest.spring.data.Addresses.addressOne;
import static example.rest.spring.data.Addresses.addressThree;
import static example.rest.spring.data.Addresses.addressTwo;

/**
 * Data for user persistence tests.
 *
 * @author Karl Bennett
 */
public class Users {

    public static final String EMAIL = "test@email.com";
    public static final String FIRST_NAME = "Test";
    public static final String LAST_NAME = "User";
    public static final String PHONE_NUMBER = "5551234";

    public static final String EMAIL_ONE = "test@email.one";
    public static final String FIRST_NAME_ONE = "Test1";
    public static final String LAST_NAME_ONE = "User1";
    public static final String PHONE_NUMBER_ONE = "5551235";

    public static final String EMAIL_TWO = "test@email.two";
    public static final String FIRST_NAME_TWO = "Test2";
    public static final String LAST_NAME_TWO = "User2";
    public static final String PHONE_NUMBER_TWO = "5551236";

    public static final String EMAIL_THREE = "test@email.three";
    public static final String FIRST_NAME_THREE = "Test3";
    public static final String LAST_NAME_THREE = "User3";
    public static final String PHONE_NUMBER_THREE = "5551237";

    public static User user() {

        return new User(EMAIL, FIRST_NAME, LAST_NAME, PHONE_NUMBER, address());
    }

    public static User userOne() {

        return new User(EMAIL_ONE, FIRST_NAME_ONE, LAST_NAME_ONE, PHONE_NUMBER_ONE, addressOne());
    }

    public static User userTwo() {

        return new User(EMAIL_TWO, FIRST_NAME_TWO, LAST_NAME_TWO, PHONE_NUMBER_TWO, addressTwo());
    }

    public static User userThree() {

        return new User(EMAIL_THREE, FIRST_NAME_THREE, LAST_NAME_THREE, PHONE_NUMBER_THREE, addressThree());
    }
}
