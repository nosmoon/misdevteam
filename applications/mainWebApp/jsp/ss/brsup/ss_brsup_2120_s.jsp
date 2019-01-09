<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brsup_2120_s.jsp
* 기능 	 	 : 지국지원-컴퓨터AS(상세보기)
* 작성일자 	 : 2004-03-15
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
// 	dataset 인스턴스 선언부분
	SS_S_ASREQDataSet ds = (SS_S_ASREQDataSet)request.getAttribute("ds");
	String flg = request.getParameter("flag");
%>
<form name="detail_form" method="post">
    <textarea name="remk"><%=ds.getRemk()%></textarea>
    <textarea name="req_rmk"><%=ds.getReq_rmk()%></textarea>
</form>

   
<script language="javascript">
    var lo_form1 = parent.document.comp_detail_form;

    lo_form1.remk.value = detail_form.remk.value;
    lo_form1.req_rmk.value = detail_form.req_rmk.value;
    
    if('<%=flg%>'=='A'){
    	lo_form1.bonm.value = '<%=ds.getBonm()%>';
    	parent.document.all.computer_id.outerHTML = 
    		'<select id="computer_id" name="computernm" class="sel_all" onChange="bocomp_search();">' +
		        '<option value="<%=ds.getEqpno()%>" selected><%=ds.getComputernm()%></option>' +
		      '</select>' ;
    } else {
	    for(i=0;i<lo_form1.computernm.options.length;i++){
	    	if(lo_form1.computernm.options[i].value=="<%=ds.getEqpno()%>"){
	    	lo_form1.computernm.options[i].selected="true";	
	    	}    
	    }    
    }
    
    for(i=0;i<lo_form1.as_stat.options.length;i++){
    	if(lo_form1.as_stat.options[i].value=="<%=ds.getAs_stat()%>"){
    	lo_form1.as_stat.options[i].selected="true";	
    	}    
    }
    
    parent.document.all.modlcd.innerText = '<%=ds.getModlcd()%>';
    parent.document.all.kndcd.innerText = '<%=ds.getKndcd()%>';
    parent.document.all.makecmpy.innerText = '<%=ds.getMakecmpy()%>';
    parent.document.all.os.innerText = '<%=ds.getOs()%>';
    parent.document.all.memolicapa.innerText = '<%=ds.getMemolicapa()%>';
    parent.document.all.hddcapa.innerText = '<%=ds.getHddcapa()%>';
    parent.document.all.monitormakecmpy.innerText = '<%=ds.getMonitormakecmpy()%>';
    parent.document.all.monitormodl.innerText = '<%=ds.getMonitormodl()%>';
    parent.document.all.monitorsize.innerText = '<%=ds.getMonitorsize()%>';
    parent.document.all.printerkind.innerText = '<%=ds.getPrinterkind()%>';
    parent.document.all.printermakecmpy.innerText = '<%=ds.getPrintermakecmpy()%>';
    parent.document.all.printermodl.innerText = '<%=ds.getPrintermodl()%>';
    
    parent.jsInit();
</script>