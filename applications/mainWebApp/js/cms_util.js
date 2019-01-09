// 초기화
function CP_CMSInit(instcode, instpswd) {

    if (instcode == "" || instpswd == "") {
        alert("CMS 로그인 정보가 없습니다.");
        return -1;
    }
 
    var dir = "C:\\CMS\\" + instcode;
    var pOutData = "";
    var pInstCode = instcode;
    var pPassword = instpswd;
    var pInstID = "KFTC123456";  // 협력업체코드(추후 리얼서비스 적용시 ID가 부여되면 그 값을 세팅함)
    // var pInstID = "HYUP059021";  // 협력업체코드

    pOutData = CMSCommAX.CMSInit(dir, pInstCode, pPassword, "", pInstID);

    if (pOutData) {
        // alert("초기화 성공" + pOutData);
        return 1;
    }
    else {
        return -1;
    }
}

// 파일전송
function CP_SendCMSFile(filename) {
    var result = "";
    result = CMSCommAX.SendCMSFile(filename);
    return result;
}

// 파일전송확인
function CP_GetResultSendFile(filename) {
    var now = new Date();
    var result = "";
    result = CMSCommAX.GetResultSendFile(now.getFullYear() + filename.substring(4, 8), filename);
    return result;
}

// 파일수신
function CP_GetCMSFile(filename) {
    var now = new Date();
    var result = "";
    alert(filename + " 파일수신합니다");
    result = CMSCommAX.GetCMSFile(filename, now.getFullYear() + filename.substring(4, 8));
    return result;
}

// 파일수신
function CP_GetExpiredCMSFile(filename) {
    var now = new Date();
    var result = "";
    alert(filename + " 기관만료파일수신합니다");
    result = CMSCommAX.GetExpiredCMSFile(filename, now.getFullYear() + filename.substring(4, 8));
    if (result == "") alert("기관만료파일수신 실패!!");
    else alert(result);
}

// 입금통지서 내역조회
function CP_ReceiptInfoReq(filename) {
    var result = "";
    alert(filename + " 입금통지서 내역조회");
    result = CMSCommAX.ReceiptInfoReq(filename);
    if (result == "") alert("입금통지서내역조회 실패!!");
    else alert(result);
}

// 파일수신가능내역조회
function CP_GetRecvFileContents(from_date, to_date, recv_type) {
    var result = "";
    
    // alert("(" + from_date + "~" + to_date + ")에 대한 수신가능내역 조회");
    result = CMSCommAX.GetRecvFileContents(from_date, to_date, recv_type);
    if (result == "") alert("(" + from_date + "~" + to_date + ")에 대한 수신가능내역 조회 실패!!");
    else alert(result);
}

// 송신결과확인
function CP_GetCnfResultSendFile() {
    var result = "";
    var from_date = document.cms.from_date.value;
    var to_date = document.cms.to_date.value;
    alert("(" + from_date + "~" + to_date + ")에 대한 송신결과확인");
    result = CMSCommAX.GetCnfResultSendFile(from_date, to_date);
    if (result == "") alert("송신결과확인 조회 실패!!");
    else alert(result);
}

// 취소가능내역조회
function CP_GetCancelFileCnf() {
    var result = "";
    var from_date = document.cms.from_date.value;
    var to_date = document.cms.to_date.value;
    alert("(" + from_date + "~" + to_date + ")에 대한 취소가능내역 조회");
    result = CMSCommAX.GetCancelFileCnf(from_date, to_date);
    if (result == "") alert("취소가능내역조회 실패!!");
    else alert(result);
}

// 파일취소
function CP_CancelSendFile(filename) {
    var now = new Date();
    var result = "";
    alert(filename + " 파일취소합니다");
    result = CMSCommAX.CancelSendFile(now.getFullYear() + filename.substring(4, 8), filename);
    return result;
}

// 역수신가능내역조회
function CP_GetReverseRecvFileCnf() {
    var result = "";
    var from_date = document.cms.from_date.value;
    var to_date = document.cms.to_date.value;
    alert("(" + from_date + "~" + to_date + ")에 대한 역수신가능내역 조회");
    result = CMSCommAX.GetReverseRecvFileCnf(from_date, to_date);
    if (result == "") alert("역수신가능내역조회 실패!!");
    else alert(result);
}

// 파일역수신
function CP_GetReverseRecvFile() {
    var now = new Date();
    var result = "";
    var filename = document.cms.filename_r2.value;
    alert(filename + " 파일수신합니다");
    result = CMSCommAX.GetReverseRecvFile(filename, now.getFullYear() + filename.substring(4, 8));
    if (result == "") alert("파일역수신 실패!!");
    else alert(result);
}

// 월간출금한도조회
function CP_MonthLimitReq() {
    var result = "";
    alert("월간출금한도조회");
    result = CMSCommAX.MonthLimitReq();
    if (result == "") alert("월간출금한도조회 실패!!");
    else alert(result);
}

// 부가서비스요청
function CP_AdditionalServiceReq() {
    var result = "";
    var gb_code = document.cms.gb_code.value;
    var bank_cd = document.cms.bank_cd.value;
    var acct_no = document.cms.acct_no.value;
    var payer_no = document.cms.payer_no.value;
    var reg_no = document.cms.reg_no.value;
    alert("부가서비스요청");
    result = CMSCommAX.AdditionalServiceReq(gb_code, bank_cd, acct_no, payer_no, reg_no);
    if (result == "") alert("부가서비스 요청 실패!!");
    else {
        alert(result);
        document.cms.req_cd.value = result;
    }
}

// 부가서비스 결과조회
function CP_AdditionalServiceRes() {
    var result = "";
    var gb_code = document.cms.gb_code.value;
    var req_cd = document.cms.req_cd.value;
    alert("부가서비스결과조회");
    result = CMSCommAX.AdditionalServiceRes(gb_code, req_cd);
    if (result == "") alert("부가서비스 결과조회 실패!!");
    else alert(result);
}
