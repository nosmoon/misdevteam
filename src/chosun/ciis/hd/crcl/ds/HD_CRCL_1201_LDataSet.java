/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.crcl.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.crcl.dm.*;
import chosun.ciis.hd.crcl.rec.*;

/**
 * 
 */


public class HD_CRCL_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_CRCL_1201_LDataSet(){}
	public HD_CRCL_1201_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_CRCL_1201_LCURLISTRecord rec = new HD_CRCL_1201_LCURLISTRecord();
			rec.row_seq = Util.checkString(rset0.getString("row_seq"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.paty_crc_cd = Util.checkString(rset0.getString("paty_crc_cd"));
			rec.paty_crc_nm = Util.checkString(rset0.getString("paty_crc_nm"));
			rec.fix_fix_rate_clsf = Util.checkString(rset0.getString("fix_fix_rate_clsf"));
			rec.paty_crc_dus = Util.checkString(rset0.getString("paty_crc_dus"));
			rec.entr_dt = Util.checkString(rset0.getString("entr_dt"));
			rec.lve_dt = Util.checkString(rset0.getString("lve_dt"));
			rec.entr_yn_nm = Util.checkString(rset0.getString("entr_yn_nm"));
			rec.entr_yn = Util.checkString(rset0.getString("entr_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_CRCL_1201_LDataSet ds = (HD_CRCL_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_CRCL_1201_LCURLISTRecord curlistRec = (HD_CRCL_1201_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.row_seq%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.paty_crc_cd%>
<%= curlistRec.paty_crc_nm%>
<%= curlistRec.paty_crc_dus%>
<%= curlistRec.entr_dt%>
<%= curlistRec.lve_dt%>
<%= curlistRec.entr_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 18 20:33:06 KST 2009 */