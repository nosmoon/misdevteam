/***************************************************************************************************
* 파일명 : SP_PS_S_RDR_CMPROBJ.java
* 기능 :   독자-중재처리 비교대상내역 상세조회화면
* 작성일자 : 2004-02-23
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-중재처리 비교대상내역 상세조회화면
 *
 */


public class PS_S_RDR_CMPROBJDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList agreecur = new ArrayList();
	public ArrayList hobbycur = new ArrayList();
	public ArrayList bonlistcur = new ArrayList();
	public ArrayList bonuscur = new ArrayList();
	public ArrayList intercur = new ArrayList();
	public ArrayList publrdrcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_S_RDR_CMPROBJDataSet(){}
	public PS_S_RDR_CMPROBJDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PS_S_RDR_CMPROBJPUBLRDRCURRecord rec = new PS_S_RDR_CMPROBJPUBLRDRCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdr_nm = Util.checkString(rset0.getString("rdr_nm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.arbtaplcdt = Util.checkString(rset0.getString("arbtaplcdt"));
			rec.arbtno = Util.checkString(rset0.getString("arbtno"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.paty_clsfcd = Util.checkString(rset0.getString("paty_clsfcd"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.bidt = Util.checkString(rset0.getString("bidt"));
			rec.lusoclsfcd = Util.checkString(rset0.getString("lusoclsfcd"));
			rec.subsfrser_no = Util.checkString(rset0.getString("subsfrser_no"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.rdrptph_no = Util.checkString(rset0.getString("rdrptph_no"));
			rec.rdroffinm = Util.checkString(rset0.getString("rdroffinm"));
			rec.rdroffitel_no = Util.checkString(rset0.getString("rdroffitel_no"));
			rec.rdrposi = Util.checkString(rset0.getString("rdrposi"));
			rec.recpclsf = Util.checkString(rset0.getString("recpclsf"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.sendmthd = Util.checkString(rset0.getString("sendmthd"));
			rec.aplc_persflnm = Util.checkString(rset0.getString("aplc_persflnm"));
			rec.aplc_persoffinm = Util.checkString(rset0.getString("aplc_persoffinm"));
			rec.aplc_persposi = Util.checkString(rset0.getString("aplc_persposi"));
			rec.aplc_perstel_no = Util.checkString(rset0.getString("aplc_perstel_no"));
			rec.aplc_persptph_no = Util.checkString(rset0.getString("aplc_persptph_no"));
			rec.clamplflnm = Util.checkString(rset0.getString("clamplflnm"));
			rec.clamploffinm = Util.checkString(rset0.getString("clamploffinm"));
			rec.clamplposi = Util.checkString(rset0.getString("clamplposi"));
			rec.clampltel_no = Util.checkString(rset0.getString("clampltel_no"));
			rec.clamplptph_no = Util.checkString(rset0.getString("clamplptph_no"));
			rec.clamplzip = Util.checkString(rset0.getString("clamplzip"));
			rec.clampladdr = Util.checkString(rset0.getString("clampladdr"));
			rec.clampldtlsaddr = Util.checkString(rset0.getString("clampldtlsaddr"));
			rec.acpntypeclsf = Util.checkString(rset0.getString("acpntypeclsf"));
			rec.acpntypecd = Util.checkString(rset0.getString("acpntypecd"));
			rec.linkyear = Util.checkString(rset0.getString("linkyear"));
			rec.sendyncd = Util.checkString(rset0.getString("sendyncd"));
			rec.alonpaycd = Util.checkString(rset0.getString("alonpaycd"));
			rec.amno = Util.checkString(rset0.getString("amno"));
			rec.hdqtemp_no = Util.checkString(rset0.getString("hdqtemp_no"));
			rec.mang_empno = Util.checkString(rset0.getString("mang_empno"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.taxstmtexne = Util.checkString(rset0.getString("taxstmtexne"));
			rec.taxstmtissudt = Util.checkString(rset0.getString("taxstmtissudt"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			this.publrdrcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			PS_S_RDR_CMPROBJHOBBYCURRecord rec = new PS_S_RDR_CMPROBJHOBBYCURRecord();
			rec.hbycd = Util.checkString(rset1.getString("hbycd"));
			rec.hbyseq = Util.checkString(rset1.getString("hbyseq"));
			this.hobbycur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			PS_S_RDR_CMPROBJINTERCURRecord rec = new PS_S_RDR_CMPROBJINTERCURRecord();
			rec.conccd = Util.checkString(rset2.getString("conccd"));
			rec.concseq = Util.checkString(rset2.getString("concseq"));
			this.intercur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			PS_S_RDR_CMPROBJAGREECURRecord rec = new PS_S_RDR_CMPROBJAGREECURRecord();
			rec.agrmntdt = Util.checkString(rset3.getString("agrmntdt"));
			rec.agrmntamt = Util.checkString(rset3.getString("agrmntamt"));
			rec.agrmntseq = Util.checkString(rset3.getString("agrmntseq"));
			this.agreecur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			PS_S_RDR_CMPROBJBONUSCURRecord rec = new PS_S_RDR_CMPROBJBONUSCURRecord();
			rec.aplcseq = Util.checkString(rset4.getString("aplcseq"));
			rec.recppersnm = Util.checkString(rset4.getString("recppersnm"));
			rec.recpperszip = Util.checkString(rset4.getString("recpperszip"));
			rec.recppersaddr = Util.checkString(rset4.getString("recppersaddr"));
			rec.senddt = Util.checkString(rset4.getString("senddt"));
			rec.sendclsf = Util.checkString(rset4.getString("sendclsf"));
			rec.sendmthd = Util.checkString(rset4.getString("sendmthd"));
			rec.memo = Util.checkString(rset4.getString("memo"));
			this.bonuscur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			PS_S_RDR_CMPROBJBONLISTCURRecord rec = new PS_S_RDR_CMPROBJBONLISTCURRecord();
			rec.aplcseq = Util.checkString(rset5.getString("aplcseq"));
			rec.bns_bookseq = Util.checkString(rset5.getString("bns_bookseq"));
			rec.bns_bookcd = Util.checkString(rset5.getString("bns_bookcd"));
			this.bonlistcur.add(rec);
		}
	}

	public String publrdrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = publrdrcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJPUBLRDRCURRecord rec = (PS_S_RDR_CMPROBJPUBLRDRCURRecord)publrdrcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdr_nm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String hobbycurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = hobbycur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJHOBBYCURRecord rec = (PS_S_RDR_CMPROBJHOBBYCURRecord)hobbycur.get(i);
			
			
			String code = rec.hbycd;
			String name = rec.hbyseq;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String intercurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intercur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJINTERCURRecord rec = (PS_S_RDR_CMPROBJINTERCURRecord)intercur.get(i);
			
			
			String code = rec.conccd;
			String name = rec.concseq;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String agreecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = agreecur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJAGREECURRecord rec = (PS_S_RDR_CMPROBJAGREECURRecord)agreecur.get(i);
			
			
			String code = rec.agrmntdt;
			String name = rec.agrmntamt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String bonuscurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bonuscur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJBONUSCURRecord rec = (PS_S_RDR_CMPROBJBONUSCURRecord)bonuscur.get(i);
			
			
			String code = rec.aplcseq;
			String name = rec.recppersnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String bonlistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bonlistcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJBONLISTCURRecord rec = (PS_S_RDR_CMPROBJBONLISTCURRecord)bonlistcur.get(i);
			
			
			String code = rec.aplcseq;
			String name = rec.bns_bookseq;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String publrdrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = publrdrcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJPUBLRDRCURRecord rec = (PS_S_RDR_CMPROBJPUBLRDRCURRecord)publrdrcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdr_nm;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String hobbycurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = hobbycur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJHOBBYCURRecord rec = (PS_S_RDR_CMPROBJHOBBYCURRecord)hobbycur.get(i);
			
			
			String code = rec.hbycd;
			String name = rec.hbyseq;
			
			sb.append("<input name=\"");
			sb.append("hbycd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String intercurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intercur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJINTERCURRecord rec = (PS_S_RDR_CMPROBJINTERCURRecord)intercur.get(i);
			
			
			String code = rec.conccd;
			String name = rec.concseq;
			
			sb.append("<input name=\"");
			sb.append("conccd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String agreecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = agreecur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJAGREECURRecord rec = (PS_S_RDR_CMPROBJAGREECURRecord)agreecur.get(i);
			
			
			String code = rec.agrmntdt;
			String name = rec.agrmntamt;
			
			sb.append("<input name=\"");
			sb.append("agrmntdt");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String bonuscurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bonuscur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJBONUSCURRecord rec = (PS_S_RDR_CMPROBJBONUSCURRecord)bonuscur.get(i);
			
			
			String code = rec.aplcseq;
			String name = rec.recppersnm;
			
			sb.append("<input name=\"");
			sb.append("aplcseq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String bonlistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bonlistcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJBONLISTCURRecord rec = (PS_S_RDR_CMPROBJBONLISTCURRecord)bonlistcur.get(i);
			
			
			String code = rec.aplcseq;
			String name = rec.bns_bookseq;
			
			sb.append("<input name=\"");
			sb.append("aplcseq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String publrdrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = publrdrcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJPUBLRDRCURRecord rec = (PS_S_RDR_CMPROBJPUBLRDRCURRecord)publrdrcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdr_nm;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String hobbycurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = hobbycur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJHOBBYCURRecord rec = (PS_S_RDR_CMPROBJHOBBYCURRecord)hobbycur.get(i);
			
			
			String code = rec.hbycd;
			String name = rec.hbyseq;
			
			sb.append("<input name=\"");
			sb.append("hbycd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String intercurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intercur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJINTERCURRecord rec = (PS_S_RDR_CMPROBJINTERCURRecord)intercur.get(i);
			
			
			String code = rec.conccd;
			String name = rec.concseq;
			
			sb.append("<input name=\"");
			sb.append("conccd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String agreecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = agreecur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJAGREECURRecord rec = (PS_S_RDR_CMPROBJAGREECURRecord)agreecur.get(i);
			
			
			String code = rec.agrmntdt;
			String name = rec.agrmntamt;
			
			sb.append("<input name=\"");
			sb.append("agrmntdt");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String bonuscurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bonuscur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJBONUSCURRecord rec = (PS_S_RDR_CMPROBJBONUSCURRecord)bonuscur.get(i);
			
			
			String code = rec.aplcseq;
			String name = rec.recppersnm;
			
			sb.append("<input name=\"");
			sb.append("aplcseq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String bonlistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bonlistcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_CMPROBJBONLISTCURRecord rec = (PS_S_RDR_CMPROBJBONLISTCURRecord)bonlistcur.get(i);
			
			
			String code = rec.aplcseq;
			String name = rec.bns_bookseq;
			
			sb.append("<input name=\"");
			sb.append("aplcseq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_S_RDR_CMPROBJDataSet ds = (PS_S_RDR_CMPROBJDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.publrdrcur.size(); i++){
		PS_S_RDR_CMPROBJPUBLRDRCURRecord publrdrcurRec = (PS_S_RDR_CMPROBJPUBLRDRCURRecord)ds.publrdrcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.hobbycur.size(); i++){
		PS_S_RDR_CMPROBJHOBBYCURRecord hobbycurRec = (PS_S_RDR_CMPROBJHOBBYCURRecord)ds.hobbycur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.intercur.size(); i++){
		PS_S_RDR_CMPROBJINTERCURRecord intercurRec = (PS_S_RDR_CMPROBJINTERCURRecord)ds.intercur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.agreecur.size(); i++){
		PS_S_RDR_CMPROBJAGREECURRecord agreecurRec = (PS_S_RDR_CMPROBJAGREECURRecord)ds.agreecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bonuscur.size(); i++){
		PS_S_RDR_CMPROBJBONUSCURRecord bonuscurRec = (PS_S_RDR_CMPROBJBONUSCURRecord)ds.bonuscur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bonlistcur.size(); i++){
		PS_S_RDR_CMPROBJBONLISTCURRecord bonlistcurRec = (PS_S_RDR_CMPROBJBONLISTCURRecord)ds.bonlistcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPublrdrcur()%>
<%= ds.getHobbycur()%>
<%= ds.getIntercur()%>
<%= ds.getAgreecur()%>
<%= ds.getBonuscur()%>
<%= ds.getBonlistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= publrdrcurRec.rdr_no%>
<%= publrdrcurRec.rdr_nm%>
<%= publrdrcurRec.bonm%>
<%= publrdrcurRec.arbtaplcdt%>
<%= publrdrcurRec.arbtno%>
<%= publrdrcurRec.medinm%>
<%= publrdrcurRec.paty_clsfcd%>
<%= publrdrcurRec.prn%>
<%= publrdrcurRec.email%>
<%= publrdrcurRec.bidt%>
<%= publrdrcurRec.lusoclsfcd%>
<%= publrdrcurRec.subsfrser_no%>
<%= publrdrcurRec.rdrtel_no%>
<%= publrdrcurRec.rdrptph_no%>
<%= publrdrcurRec.rdroffinm%>
<%= publrdrcurRec.rdroffitel_no%>
<%= publrdrcurRec.rdrposi%>
<%= publrdrcurRec.recpclsf%>
<%= publrdrcurRec.dlvaddr%>
<%= publrdrcurRec.dlvdtlsaddr%>
<%= publrdrcurRec.dlvzip%>
<%= publrdrcurRec.sendmthd%>
<%= publrdrcurRec.aplc_persflnm%>
<%= publrdrcurRec.aplc_persoffinm%>
<%= publrdrcurRec.aplc_persposi%>
<%= publrdrcurRec.aplc_perstel_no%>
<%= publrdrcurRec.aplc_persptph_no%>
<%= publrdrcurRec.clamplflnm%>
<%= publrdrcurRec.clamploffinm%>
<%= publrdrcurRec.clamplposi%>
<%= publrdrcurRec.clampltel_no%>
<%= publrdrcurRec.clamplptph_no%>
<%= publrdrcurRec.clamplzip%>
<%= publrdrcurRec.clampladdr%>
<%= publrdrcurRec.clampldtlsaddr%>
<%= publrdrcurRec.acpntypeclsf%>
<%= publrdrcurRec.acpntypecd%>
<%= publrdrcurRec.linkyear%>
<%= publrdrcurRec.sendyncd%>
<%= publrdrcurRec.alonpaycd%>
<%= publrdrcurRec.amno%>
<%= publrdrcurRec.hdqtemp_no%>
<%= publrdrcurRec.mang_empno%>
<%= publrdrcurRec.rdr_extnno%>
<%= publrdrcurRec.taxstmtexne%>
<%= publrdrcurRec.taxstmtissudt%>
<%= publrdrcurRec.memo%>
<%= hobbycurRec.hbycd%>
<%= hobbycurRec.hbyseq%>
<%= intercurRec.conccd%>
<%= intercurRec.concseq%>
<%= agreecurRec.agrmntdt%>
<%= agreecurRec.agrmntamt%>
<%= agreecurRec.agrmntseq%>
<%= bonuscurRec.aplcseq%>
<%= bonuscurRec.recppersnm%>
<%= bonuscurRec.recpperszip%>
<%= bonuscurRec.recppersaddr%>
<%= bonuscurRec.senddt%>
<%= bonuscurRec.sendclsf%>
<%= bonuscurRec.sendmthd%>
<%= bonuscurRec.memo%>
<%= bonlistcurRec.aplcseq%>
<%= bonlistcurRec.bns_bookseq%>
<%= bonlistcurRec.bns_bookcd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 27 15:39:41 KST 2004 */