<%@ page contentType="text/html; charset=EUC-KR" %>
<HTML>
<HEAD>
<script type="text/javascript">
    // �� frame ����
    document.write('<iframe id="hiddenFrame" style="display:none" width="0" height="0" ></iframe>');

    // �ֱ������� ����� �Լ�
    function onScheduler(){

        // �� �������� ��û
        var dataobj = document.frames["hiddenFrame"];
        if(dataobj){
            dataobj.location.href = "http://ciis.chosun.com/common/jsp/blank.jsp";
        }
        // 10�� ����(���� �������� ���� ����)
        setTimeout("onScheduler()", 1000*60*10);
    }

    // �ʱ� ����(form�� onLoad�� ��ġ�Ͽ��� ��)
    onScheduler();

</script>
<META http-equiv="Content-Type" content="text/html; charset=euc-kr">
<title>refresh</title>

</HEAD>
<BODY border="0" leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0" cellpadding="0" cellspacing="0" scroll="auto">

</body>
</HTML>
