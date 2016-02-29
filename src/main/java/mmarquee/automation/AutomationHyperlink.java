/*
 * Copyright 2016 inpwtepydjuf@gmail.com
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

package mmarquee.automation;

import com.sun.jna.platform.win32.WinDef;
import mmarquee.automation.mouse.AutomationMouse;
import mmarquee.automation.uiautomation.*;

/**
 * Created by inpwt on 03/02/2016.
 */
public class AutomationHyperlink extends AutomationBase {
    /**
     * Constructor for the AutomationHyperlink
     * @param element
     * @param uiAuto
     */
    public AutomationHyperlink(IUIAutomationElement element, IUIAutomation uiAuto) {
        super(element, uiAuto);
    }

    /**
     * Fires the click event associated with this element.
     *
     * The Delphi version of this depends on getting the clickable point for the control, and
     * finding middle of the control and clicking on it, but the Com4j classes skip this and
     * the property version of this also does not work
     */
    public void click() {
        WinDef.POINT point = this.getClickablePoint();

        AutomationMouse mouse = new AutomationMouse();
        mouse.setLocation(point.x, point.y);
        mouse.leftClick();
    }
}