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


public class HD_CRCL_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_CRCL_1001_LDataSet(){}
	public HD_CRCL_1001_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			HD_CRCL_1001_LCURLISTRecord rec = new HD_CRCL_1001_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.paty_crc_cd = Util.checkString(rset0.getString("paty_crc_cd"));
			rec.bgn_dty_cd = Util.checkString(rset0.getString("bgn_dty_cd"));
			rec.end_dty_cd = Util.checkString(rset0.getString("end_dty_cd"));
			rec.fix_fix_rate_clsf = Util.checkString(rset0.getString("fix_fix_rate_clsf"));
			rec.rgla_dduc_dus = Util.checkString(rset0.getString("rgla_dduc_dus"));
			rec.rgla_dduc_ratio = Util.checkString(rset0.getString("rgla_dduc_ratio"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_CRCL_1001_LDataSet ds = (HD_CRCL_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_CRCL_1001_LCURLISTRecord curlistRec = (HD_CRCL_1001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seq%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.paty_crc_cd%>
<%= curlistRec.bgn_dty_cd%>
<%= curlistRec.end_dty_cd%>
<%= curlistRec.fix_fix_rate_clsf%>
<%= curlistRec.rgla_dduc_dus%>
<%= curlistRec.rgla_dduc_ratio%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 17 09:59:30 KST 2009 */