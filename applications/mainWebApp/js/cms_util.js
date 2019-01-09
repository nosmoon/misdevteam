// �ʱ�ȭ
function CP_CMSInit(instcode, instpswd) {

    if (instcode == "" || instpswd == "") {
        alert("CMS �α��� ������ �����ϴ�.");
        return -1;
    }
 
    var dir = "C:\\CMS\\" + instcode;
    var pOutData = "";
    var pInstCode = instcode;
    var pPassword = instpswd;
    var pInstID = "KFTC123456";  // ���¾�ü�ڵ�(���� ���󼭺� ����� ID�� �ο��Ǹ� �� ���� ������)
    // var pInstID = "HYUP059021";  // ���¾�ü�ڵ�

    pOutData = CMSCommAX.CMSInit(dir, pInstCode, pPassword, "", pInstID);

    if (pOutData) {
        // alert("�ʱ�ȭ ����" + pOutData);
        return 1;
    }
    else {
        return -1;
    }
}

// ��������
function CP_SendCMSFile(filename) {
    var result = "";
    result = CMSCommAX.SendCMSFile(filename);
    return result;
}

// ��������Ȯ��
function CP_GetResultSendFile(filename) {
    var now = new Date();
    var result = "";
    result = CMSCommAX.GetResultSendFile(now.getFullYear() + filename.substring(4, 8), filename);
    return result;
}

// ���ϼ���
function CP_GetCMSFile(filename) {
    var now = new Date();
    var result = "";
    alert(filename + " ���ϼ����մϴ�");
    result = CMSCommAX.GetCMSFile(filename, now.getFullYear() + filename.substring(4, 8));
    return result;
}

// ���ϼ���
function CP_GetExpiredCMSFile(filename) {
    var now = new Date();
    var result = "";
    alert(filename + " ����������ϼ����մϴ�");
    result = CMSCommAX.GetExpiredCMSFile(filename, now.getFullYear() + filename.substring(4, 8));
    if (result == "") alert("����������ϼ��� ����!!");
    else alert(result);
}

// �Ա������� ������ȸ
function CP_ReceiptInfoReq(filename) {
    var result = "";
    alert(filename + " �Ա������� ������ȸ");
    result = CMSCommAX.ReceiptInfoReq(filename);
    if (result == "") alert("�Ա�������������ȸ ����!!");
    else alert(result);
}

// ���ϼ��Ű��ɳ�����ȸ
function CP_GetRecvFileContents(from_date, to_date, recv_type) {
    var result = "";
    
    // alert("(" + from_date + "~" + to_date + ")�� ���� ���Ű��ɳ��� ��ȸ");
    result = CMSCommAX.GetRecvFileContents(from_date, to_date, recv_type);
    if (result == "") alert("(" + from_date + "~" + to_date + ")�� ���� ���Ű��ɳ��� ��ȸ ����!!");
    else alert(result);
}

// �۽Ű��Ȯ��
function CP_GetCnfResultSendFile() {
    var result = "";
    var from_date = document.cms.from_date.value;
    var to_date = document.cms.to_date.value;
    alert("(" + from_date + "~" + to_date + ")�� ���� �۽Ű��Ȯ��");
    result = CMSCommAX.GetCnfResultSendFile(from_date, to_date);
    if (result == "") alert("�۽Ű��Ȯ�� ��ȸ ����!!");
    else alert(result);
}

// ��Ұ��ɳ�����ȸ
function CP_GetCancelFileCnf() {
    var result = "";
    var from_date = document.cms.from_date.value;
    var to_date = document.cms.to_date.value;
    alert("(" + from_date + "~" + to_date + ")�� ���� ��Ұ��ɳ��� ��ȸ");
    result = CMSCommAX.GetCancelFileCnf(from_date, to_date);
    if (result == "") alert("��Ұ��ɳ�����ȸ ����!!");
    else alert(result);
}

// �������
function CP_CancelSendFile(filename) {
    var now = new Date();
    var result = "";
    alert(filename + " ��������մϴ�");
    result = CMSCommAX.CancelSendFile(now.getFullYear() + filename.substring(4, 8), filename);
    return result;
}

// �����Ű��ɳ�����ȸ
function CP_GetReverseRecvFileCnf() {
    var result = "";
    var from_date = document.cms.from_date.value;
    var to_date = document.cms.to_date.value;
    alert("(" + from_date + "~" + to_date + ")�� ���� �����Ű��ɳ��� ��ȸ");
    result = CMSCommAX.GetReverseRecvFileCnf(from_date, to_date);
    if (result == "") alert("�����Ű��ɳ�����ȸ ����!!");
    else alert(result);
}

// ���Ͽ�����
function CP_GetReverseRecvFile() {
    var now = new Date();
    var result = "";
    var filename = document.cms.filename_r2.value;
    alert(filename + " ���ϼ����մϴ�");
    result = CMSCommAX.GetReverseRecvFile(filename, now.getFullYear() + filename.substring(4, 8));
    if (result == "") alert("���Ͽ����� ����!!");
    else alert(result);
}

// ��������ѵ���ȸ
function CP_MonthLimitReq() {
    var result = "";
    alert("��������ѵ���ȸ");
    result = CMSCommAX.MonthLimitReq();
    if (result == "") alert("��������ѵ���ȸ ����!!");
    else alert(result);
}

// �ΰ����񽺿�û
function CP_AdditionalServiceReq() {
    var result = "";
    var gb_code = document.cms.gb_code.value;
    var bank_cd = document.cms.bank_cd.value;
    var acct_no = document.cms.acct_no.value;
    var payer_no = document.cms.payer_no.value;
    var reg_no = document.cms.reg_no.value;
    alert("�ΰ����񽺿�û");
    result = CMSCommAX.AdditionalServiceReq(gb_code, bank_cd, acct_no, payer_no, reg_no);
    if (result == "") alert("�ΰ����� ��û ����!!");
    else {
        alert(result);
        document.cms.req_cd.value = result;
    }
}

// �ΰ����� �����ȸ
function CP_AdditionalServiceRes() {
    var result = "";
    var gb_code = document.cms.gb_code.value;
    var req_cd = document.cms.req_cd.value;
    alert("�ΰ����񽺰����ȸ");
    result = CMSCommAX.AdditionalServiceRes(gb_code, req_cd);
    if (result == "") alert("�ΰ����� �����ȸ ����!!");
    else alert(result);
}
