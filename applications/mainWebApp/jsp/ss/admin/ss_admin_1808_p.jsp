<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%

    applySession = true;	// 세션 적용 여부

	StringBuffer sb = new StringBuffer("");
	
	SS_L_SQL_EXECUTE_DWLOADDataSet ds = (SS_L_SQL_EXECUTE_DWLOADDataSet)request.getAttribute("ds");

	out.clearBuffer();	
	
		if(ds != null){ 
			for(int i=0; i<ds.resultcur.size(); i++){
				SS_L_SQL_EXECUTE_DWLOADRESULTCURRecord rec = (SS_L_SQL_EXECUTE_DWLOADRESULTCURRecord)ds.resultcur.get(i);
	
				//테이블의 데이타 생성
				sb.append("\"");
				sb.append(rec.a1).append("\",\"");
				sb.append(rec.a2).append("\",\"");
				sb.append(rec.a3).append("\",\"");
				sb.append(rec.a4).append("\",\"");
				sb.append(rec.a5).append("\",\"");
				sb.append(rec.a6).append("\",\"");
				sb.append(rec.a7).append("\",\"");
				sb.append(rec.a8).append("\",\"");
				sb.append(rec.a9).append("\",\"");
				sb.append(rec.a10).append("\",\"");
				sb.append(rec.a11).append("\",\"");
				sb.append(rec.a12).append("\",\"");
				sb.append(rec.a13).append("\",\"");
				sb.append(rec.a14).append("\",\"");
				sb.append(rec.a15).append("\",\"");
				sb.append(rec.a16).append("\",\"");
				sb.append(rec.a17).append("\",\"");
				sb.append(rec.a18).append("\",\"");
				sb.append(rec.a19).append("\",\"");
				sb.append(rec.a20).append("\",\"");
				sb.append(rec.a21).append("\",\"");
				sb.append(rec.a22).append("\",\"");
				sb.append(rec.a23).append("\",\"");
				sb.append(rec.a24).append("\",\"");
				sb.append(rec.a25).append("\",\"");
				sb.append(rec.a26).append("\",\"");
				sb.append(rec.a27).append("\",\"");
				sb.append(rec.a28).append("\",\"");
				sb.append(rec.a29).append("\",\"");
				sb.append(rec.a30).append("\",\"");
				sb.append(rec.a31).append("\",\"");
				sb.append(rec.a32).append("\",\"");
				sb.append(rec.a33).append("\",\"");
				sb.append(rec.a34).append("\",\"");
				sb.append(rec.a35).append("\",\"");
				sb.append(rec.a36).append("\",\"");
				sb.append(rec.a37).append("\",\"");
				sb.append(rec.a38).append("\",\"");
				sb.append(rec.a39).append("\",\"");
				sb.append(rec.a40).append("\",\"");
				sb.append(rec.a41).append("\",\"");
				sb.append(rec.a42).append("\",\"");
				sb.append(rec.a43).append("\",\"");
				sb.append(rec.a44).append("\",\"");
				sb.append(rec.a45).append("\",\"");
				sb.append(rec.a46).append("\",\"");
				sb.append(rec.a47).append("\",\"");
				sb.append(rec.a48).append("\",\"");
				sb.append(rec.a49).append("\",\"");
				sb.append(rec.a50).append("\",\"");
				sb.append(rec.a51).append("\",\"");
				sb.append(rec.a52).append("\",\"");
				sb.append(rec.a53).append("\",\"");
				sb.append(rec.a54).append("\",\"");
				sb.append(rec.a55).append("\",\"");
				sb.append(rec.a56).append("\",\"");
				sb.append(rec.a57).append("\",\"");
				sb.append(rec.a58).append("\",\"");
				sb.append(rec.a59).append("\",\"");
				sb.append(rec.a60).append("\",\"");
				sb.append(rec.a61).append("\",\"");
				sb.append(rec.a62).append("\",\"");
				sb.append(rec.a63).append("\",\"");
				sb.append(rec.a64).append("\",\"");
				sb.append(rec.a65).append("\",\"");
				sb.append(rec.a66).append("\",\"");
				sb.append(rec.a67).append("\",\"");
				sb.append(rec.a68).append("\",\"");
				sb.append(rec.a69).append("\",\"");
				sb.append(rec.a70).append("\",\"");
				sb.append(rec.a71).append("\",\"");
				sb.append(rec.a72).append("\",\"");
				sb.append(rec.a73).append("\",\"");
				sb.append(rec.a74).append("\",\"");
				sb.append(rec.a75).append("\",\"");
				sb.append(rec.a76).append("\",\"");
				sb.append(rec.a77).append("\",\"");
				sb.append(rec.a78).append("\",\"");
				sb.append(rec.a79).append("\",\"");
				sb.append(rec.a80).append("\",\"");
				sb.append(rec.a81).append("\",\"");
				sb.append(rec.a82).append("\",\"");
				sb.append(rec.a83).append("\",\"");
				sb.append(rec.a84).append("\",\"");
				sb.append(rec.a85).append("\",\"");
				sb.append(rec.a86).append("\",\"");
				sb.append(rec.a87).append("\",\"");
				sb.append(rec.a88).append("\",\"");
				sb.append(rec.a89).append("\",\"");
				sb.append(rec.a90).append("\",\"");
				sb.append(rec.a91).append("\",\"");
				sb.append(rec.a92).append("\",\"");
				sb.append(rec.a93).append("\",\"");
				sb.append(rec.a94).append("\",\"");
				sb.append(rec.a95).append("\",\"");
				sb.append(rec.a96).append("\",\"");
				sb.append(rec.a97).append("\",\"");
				sb.append(rec.a98).append("\",\"");
				sb.append(rec.a99).append("\",\"");
				sb.append(rec.a100).append("\"\r\n");
			}
		}
	

		byte[] bytestream = sb.toString().getBytes();
	
		response.reset();
		response.setHeader("Content-Type", "application/vnd.ms-excel;charset=KSC5601");
		response.setHeader("Content-Disposition", "attachment; filename=CRMDATA.csv");
		response.setHeader("Content-Description", "JSP Generated Data");
		response.setHeader("Content-Transfer-Encoding", "binary;");
		response.setHeader("Pragma", "no-cache;");
		response.setHeader("Expires", "-1;");
	
		OutputStream outStream = response.getOutputStream();
		outStream.write(bytestream);
		outStream.close();
	

%>
