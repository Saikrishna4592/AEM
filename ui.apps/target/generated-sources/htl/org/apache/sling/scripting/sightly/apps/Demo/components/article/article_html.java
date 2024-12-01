/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.Demo.components.article;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class article_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _global_model = null;
Object _dynamic_currentstyle = bindings.get("currentstyle");
{
    String var_0 = (((renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "text")) + "\n") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "des"), "text"))) + "\n\n\n");
    out.write(renderContext.getObjectModel().toString(var_0));
}
_global_model = renderContext.call("use", com.adobe.aem.guides.demo.core.models.Demo.class.getName(), obj());
out.write("<div></div>\n\n<div>");
{
    String var_1 = ("Title: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text")));
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</div>\n\n<div>");
{
    String var_2 = ("Des: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "des"), "text")));
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</div>\n<h1>");
{
    String var_3 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.call("format", "dd-MM-yyyy", obj().with("format", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "date"))), "text")));
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</h1>\n\n<div>");
{
    String var_4 = ("Number: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "number"), "text")));
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</div>");
{
    String var_5 = (("\n" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentstyle, "des"), "text"))) + "\n");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("<img");
{
    Object var_attrvalue6 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image");
    {
        Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "uri");
        {
            Object var_shoulddisplayattr9 = ((renderContext.getObjectModel().toBoolean(var_attrcontent7) ? var_attrcontent7 : ("false".equals(var_attrvalue6))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr9)) {
                out.write(" src");
                {
                    boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                    if (!var_istrueattr8) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent7));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>");
{
    String var_10 = ((("\n" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "number"), "text"))) + "\n") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "company"), "text")));
    out.write(renderContext.getObjectModel().toString(var_10));
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

