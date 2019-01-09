<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ page import="somo.framework.util.*,chosun.ciis.ss.sls.brmgr.ds.*,chosun.ciis.ss.sls.brmgr.dm.*,chosun.ciis.ss.sls.brmgr.rec.*,chosun.ciis.ss.sls.brmgr.servlet.*"%>
<html>
<link rel="stylesheet" href="/css/style_sheet.css" type="text/css">
<head>
	<script language="javascript">
		<!--
		parent.mainbody.style.cursor = "DEFAULT";
		parent.idwaiting.style.display = "none";
		//-->
	</script>
</head>

<%
	String[] subsmappli = new String[]{"", "", "", "", "", "", "", "", "", "", "", "", ""};
	String befsubsmappli = "";
	String bocd       = "";
	
	int [] val_0_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int [] val_1_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int [] val_2_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int [] val_3_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int [] val_4_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int [] val_5_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int [] val_6_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int [] val_7over_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int [] val_below_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int [] val_99_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int [] tot_valid_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int [] tot_invalid_num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	ABC_L_AUTHRATIODataSet ds = (ABC_L_AUTHRATIODataSet)request.getAttribute("ds");
	
	int index = 0;
	
	if (ds != null) {
		for(int i=0; i<ds.curauthratio.size(); i++){
			ABC_L_AUTHRATIOCURAUTHRATIORecord curauthratioRec = (ABC_L_AUTHRATIOCURAUTHRATIORecord)ds.curauthratio.get(i);

			if (i == 0) {
	    	bocd       = curauthratioRec.bocd;
	    }
			
			if (!curauthratioRec.subsmappli.equals(befsubsmappli)) {
				index++;
			}

    	subsmappli[index] = curauthratioRec.subsmappli;
			
	    
	    switch(Integer.parseInt(curauthratioRec.abcclsf)) {
	    	case -1:
	    		val_below_num[index] = Integer.parseInt(curauthratioRec.cnt);
	    		break;
	    	case 0:
	    		val_0_num[index] = Integer.parseInt(curauthratioRec.cnt);
	    		break;
	    	case 1:
	    		val_1_num[index] = Integer.parseInt(curauthratioRec.cnt);
	    		break;
	    	case 2:
	    		val_2_num[index] = Integer.parseInt(curauthratioRec.cnt);
	    		break;
	    	case 3:
	    		val_3_num[index] = Integer.parseInt(curauthratioRec.cnt);
	    		break;
	    	case 4:
	    		val_4_num[index] = Integer.parseInt(curauthratioRec.cnt);
	    		break;
	    	case 5:
	    		val_5_num[index] = Integer.parseInt(curauthratioRec.cnt);
	    		break;
	    	case 6:
	    		val_6_num[index] = Integer.parseInt(curauthratioRec.cnt);
	    		break;
	    	case 99:
	    		val_99_num[index] = Integer.parseInt(curauthratioRec.cnt);
	    		break;
	    	default:
	    		val_7over_num[index] += Integer.parseInt(curauthratioRec.cnt);
	    		break;
	    }
     	befsubsmappli = subsmappli[index];
			tot_valid_num[index] = val_0_num[index]+val_1_num[index]+val_2_num[index]+val_3_num[index]+val_4_num[index]+val_5_num[index]+val_6_num[index];
			tot_invalid_num[index] = val_7over_num[index]+val_99_num[index]+val_below_num[index];
		}
	}
%>


<body>
	<table width="100%" border="2" cellspacing="2" cellpadding="0">
	<tr>
		<td width="100" align="center">기준년월</td>
		<td width="100" align="center">지국명</td>
		<td width="120" align="center" bgcolor="yellow">당월유가</td>
		<td width="100" align="center" bgcolor="yellow">1후수</td>
		<td width="100" align="center" bgcolor="yellow">2후수</td>
		<td width="100" align="center" bgcolor="yellow">3후수</td>
		<td width="100" align="center" bgcolor="yellow">4후수</td>
		<td width="100" align="center" bgcolor="yellow">5후수</td>
		<td width="100" align="center" bgcolor="yellow">6후수</td>
		<td width="100" align="center" bgcolor="yellow">소계</td>
		<td width="100" align="center" bgcolor="orange">7후수<br>이상</td>
		<td width="100" align="center" bgcolor="orange">미수</td>
		<td width="200" align="center" bgcolor="orange">할인율위반</td>
		<td width="100" align="center" bgcolor="orange">소계</td>
		<td width="100" align="center">총부수</td>		
		<td width="200" align="center">ABC<BR>예상인증율</td>
	</tr>
<% try { %>
<%
		for (int i=1; i < (ds != null ? subsmappli.length : 2); i++) {
			if (!subsmappli[i].equals("")) {
				if (ds != null) { 
%>
	<tr>
		<td align="center"><%=subsmappli[i]%></td>
		<td align="center"><%=bocd%></td>
<%    	} 	else { %>		
	<tr>
		<td align="center">-</td>
		<td align="center">-</td>
<%
				} 
%>
		<td align="center" bgcolor="yellow"><%=val_0_num[i]%></td>
		<td align="center" bgcolor="yellow"><%=val_1_num[i]%></td>
		<td align="center" bgcolor="yellow"><%=val_2_num[i]%></td>
		<td align="center" bgcolor="yellow"><%=val_3_num[i]%></td>
		<td align="center" bgcolor="yellow"><%=val_4_num[i]%></td>
		<td align="center" bgcolor="yellow"><%=val_5_num[i]%></td>
		<td align="center" bgcolor="yellow"><%=val_6_num[i]%></td>
		<td align="center" bgcolor="yellow"><%=tot_valid_num[i]%></td>
		<td align="center" bgcolor="orange"><%=val_7over_num[i]%></td>
		<td align="center" bgcolor="orange"><%=val_99_num[i]%></td>
		<td align="center" bgcolor="orange"><%=val_below_num[i]%></td>
		<td align="center" bgcolor="orange"><%=tot_invalid_num[i]%></td>
		<td align="center"><%=(tot_valid_num[i]+tot_invalid_num[i])%></td>		
<% 		
				if (ds != null && !subsmappli[i].equals("")) { 
%>
		<td align="center"><%=((float)(tot_valid_num[i]/(float)(tot_valid_num[i]+tot_invalid_num[i])*100)+"%")%></td>
	</tr>
<% 			} else { %>		
		<td align="center">0%</td>
	</tr>
<% 			} 
			}
		}
%>		
<% } catch(Exception e) {
	 } 
%>	

	</table>
</body>
</html>