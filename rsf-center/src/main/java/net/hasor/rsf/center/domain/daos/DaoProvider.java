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
package net.hasor.rsf.center.domain.daos;
import net.hasor.rsf.center.core.dao.AbstractDao;
import net.hasor.rsf.center.core.dao.Dao;
import net.hasor.rsf.center.core.ioc.Inject;
/**
 * 
 * @version : 2015年6月30日
 * @author 赵永春(zyc@hasor.net)
 */
@Dao
public class DaoProvider extends AbstractDao<Object> {
    @Inject
    private AppDOMemDao             appDOMemDao;
    @Inject
    private ServiceInfoDOMemDao     serviceInfoDOMemDao;
    @Inject
    private ServiceJoinPortDOMemDao serviceJoinPortDOMemDao;
    @Inject
    private TerminalDOMemDao        terminalDOMemDao;
    //
    public AppDOMemDao getAppDOMemDao() {
        return this.appDOMemDao;
    }
    public ServiceInfoDOMemDao getServiceInfoDOMemDao() {
        return this.serviceInfoDOMemDao;
    }
    public ServiceJoinPortDOMemDao getServiceJoinPortDOMemDao() {
        return this.serviceJoinPortDOMemDao;
    }
    public TerminalDOMemDao getTerminalDOMemDao() {
        return this.terminalDOMemDao;
    }
}