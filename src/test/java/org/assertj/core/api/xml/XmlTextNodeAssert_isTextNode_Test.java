/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.core.api.xml;

import static org.assertj.core.util.xml.XmlUtil.parseNode;

import org.w3c.dom.Node;

/**
 * Tests for {@link XmlTextNodeAssert#isTextNode()}.  
 * 
 * @author Michał Piotrkowski
 */
public class XmlTextNodeAssert_isTextNode_Test extends AbstractXmlNodeAssertTest{

  private Node textNode = parseNode("text node");

  @Override
  protected XmlNodeAssert create_original_xml_assertion() {
    return new XmlTextNodeAssert(textNode);
  }

  @Override
  protected XmlNodeAssert invoke_successfully_method_under_test(XmlNodeAssert originalAssertion) {
    return originalAssertion.isTextNode();
  }
  
}
