<%@ page contentType="text/html;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_common_1178_l.jsp
* ��� 		 : ���� ���� �˻� (���� �Է� ���� �˻�)
* �ۼ�����   : 2003-04-13
* �ۼ���     : ����ȫ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	CO_L_RDR_SRCHDataSet ds = (CO_L_RDR_SRCHDataSet)request.getAttribute("ds");
    CO_L_RDR_SRCHCURCOMMLISTRecord rec = null;

	if(ds.curcommlist.size() == 1){
        rec = (CO_L_RDR_SRCHCURCOMMLISTRecord)ds.curcommlist.get(0);
%>
		<form name="rdr_detail_form" method="post">
            <input type=hidden name=rdr_no         value="<%= rec.rdr_no         %>">      <!--���ڹ�ȣ          -->      
            <input type=hidden name=rdrnm          value="<%= rec.rdrnm          %>">      <!--���ڸ�            --> 
            <input type=hidden name=onlmembid      value="<%= rec.onlmembid      %>">      <!--�¶���ȸ�����̵�  --> 
            <input type=hidden name=zip            value="<%= rec.dlvzip         %>">      <!--�����ȣ          --> 
            <input type=hidden name=addr           value="<%= rec.dlvaddr        %>">      <!--�ּ�              --> 
            <input type=hidden name=dtlsaddr       value="<%= rec.dlvdtlsaddr    %>">      <!--���ּ�          --> 
            <input type=hidden name=rdrtel_no1     value="<%= rec.rdrtel_no1     %>">      <!--��ȭ��ȣ1         --> 
            <input type=hidden name=rdrtel_no2     value="<%= rec.rdrtel_no2     %>">      <!--��ȭ��ȣ2         --> 
            <input type=hidden name=rdrtel_no3     value="<%= rec.rdrtel_no3     %>">      <!--��ȭ��ȣ3         --> 
            <input type=hidden name=rdrptph_no1    value="<%= rec.rdrptph_no1    %>">      <!--�޴�����ȣ1       --> 
            <input type=hidden name=rdrptph_no2    value="<%= rec.rdrptph_no2    %>">      <!--�޴�����ȣ2       --> 
            <input type=hidden name=rdrptph_no3    value="<%= rec.rdrptph_no3    %>">      <!--�޴�����ȣ3       --> 
            <input type=hidden name=email          value="<%= rec.email          %>">      <!--�����̸���        --> 
            <input type=hidden name=prn            value="<%= rec.prn            %>">      <!--�ֹε�Ϲ�ȣ      --> 
            <input type=hidden name=onlmembseq     value="<%= rec.onlmembseq     %>">      <!--�¶���ȸ���Ϸù�ȣ-->             
        </form>
        <script language="javascript">
        	parent.set_rdr_search_result();
        </script>
<%
    }else{
%>
		<script language="javascript">
        	parent.rdr_search();
        </script>
<%
    }
%>