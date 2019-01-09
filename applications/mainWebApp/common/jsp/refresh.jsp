<%@ page contentType="text/html; charset=EUC-KR" %>
<HTML>
<HEAD>
<script type="text/javascript">
    // 빈 frame 생성
    document.write('<iframe id="hiddenFrame" style="display:none" width="0" height="0" ></iframe>');

    // 주기적으로 실행될 함수
    function onScheduler(){

        // 빈 페이지를 요청
        var dataobj = document.frames["hiddenFrame"];
        if(dataobj){
            dataobj.location.href = "http://ciis.chosun.com/common/jsp/blank.jsp";
        }
        // 10분 간격(세션 설정값에 따라 변경)
        setTimeout("onScheduler()", 1000*60*10);
    }

    // 초기 실행(form의 onLoad에 위치하여도 됨)
    onScheduler();

</script>
<META http-equiv="Content-Type" content="text/html; charset=euc-kr">
<title>refresh</title>

</HEAD>
<BODY border="0" leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0" cellpadding="0" cellspacing="0" scroll="auto">

</body>
</HTML>
