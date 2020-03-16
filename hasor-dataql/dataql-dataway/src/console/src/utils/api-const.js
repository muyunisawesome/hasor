const BASE_URL = 'http://127.0.0.1:8080';
// 通用查 配置
const ApiUrl = {
    apiInfo: `${BASE_URL}/api/api-info.json`,
    apiList: `${BASE_URL}/api/api-list.json`,
    apiDetail: `${BASE_URL}/api/api-detail.json`,
    //
    execute: `${BASE_URL}/api/execute`,
    modifyPath: `${BASE_URL}/api/modify-path`,
    apiSave: `${BASE_URL}/api/api-save`,
    perform: `${BASE_URL}/api/perform`,
    smokeTest: `${BASE_URL}/api/smoke-test`,
};

export {
    ApiUrl,
};