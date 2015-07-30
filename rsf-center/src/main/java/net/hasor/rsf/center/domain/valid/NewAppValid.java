/*
 * Copyright 2008-2009 the original 赵永春(zyc@hasor.net).
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
package net.hasor.rsf.center.domain.valid;
import net.hasor.plugins.valid.Validation;
import net.hasor.rsf.center.core.valid.ValidDefine;
import net.hasor.rsf.center.domain.entity.AppDO;
import org.more.bizcommon.ResultDO;
/**
 * 
 * @version : 2015年6月28日
 * @author 赵永春(zyc@hasor.net)
 */
@ValidDefine("NewApp")
public class NewAppValid implements Validation {
    public ResultDO<String> doValidation(Object dataForm) {
        AppDO appDO = (AppDO) dataForm;
        //
        return new ResultDO<String>().setSuccess(true);
    }
}