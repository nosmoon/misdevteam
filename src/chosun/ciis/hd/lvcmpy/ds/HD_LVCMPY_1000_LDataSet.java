/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_1000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_lvcmpy_clsf_010;
	public String xx_lvcmpy_clsf_020;
	public String xx_lvcmpy_clsf_030;
	public String xx_lvcmpy_clsf_040;
	public String xx_lvcmpy_clsf_050;
	public String xx_lvcmpy_clsf_060;

	public HD_LVCMPY_1000_LDataSet(){}
	public HD_LVCMPY_1000_LDataSet(String errcode, String errmsg, String xx_lvcmpy_clsf_010, String xx_lvcmpy_clsf_020, String xx_lvcmpy_clsf_030, String xx_lvcmpy_clsf_040, String xx_lvcmpy_clsf_050, String xx_lvcmpy_clsf_060){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_lvcmpy_clsf_010 = xx_lvcmpy_clsf_010;
		this.xx_lvcmpy_clsf_020 = xx_lvcmpy_clsf_020;
		this.xx_lvcmpy_clsf_030 = xx_lvcmpy_clsf_030;
		this.xx_lvcmpy_clsf_040 = xx_lvcmpy_clsf_040;
		this.xx_lvcmpy_clsf_050 = xx_lvcmpy_clsf_050;
		this.xx_lvcmpy_clsf_060 = xx_lvcmpy_clsf_060;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_lvcmpy_clsf_010(String xx_lvcmpy_clsf_010){
		this.xx_lvcmpy_clsf_010 = xx_lvcmpy_clsf_010;
	}

	public void setXx_lvcmpy_clsf_020(String xx_lvcmpy_clsf_020){
		this.xx_lvcmpy_clsf_020 = xx_lvcmpy_clsf_020;
	}

	public void setXx_lvcmpy_clsf_030(String xx_lvcmpy_clsf_030){
		this.xx_lvcmpy_clsf_030 = xx_lvcmpy_clsf_030;
	}

	public void setXx_lvcmpy_clsf_040(String xx_lvcmpy_clsf_040){
		this.xx_lvcmpy_clsf_040 = xx_lvcmpy_clsf_040;
	}

	public void setXx_lvcmpy_clsf_050(String xx_lvcmpy_clsf_050){
		this.xx_lvcmpy_clsf_050 = xx_lvcmpy_clsf_050;
	}

	public void setXx_lvcmpy_clsf_060(String xx_lvcmpy_clsf_060){
		this.xx_lvcmpy_clsf_060 = xx_lvcmpy_clsf_060;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_lvcmpy_clsf_010(){
		return this.xx_lvcmpy_clsf_010;
	}

	public String getXx_lvcmpy_clsf_020(){
		return this.xx_lvcmpy_clsf_020;
	}

	public String getXx_lvcmpy_clsf_030(){
		return this.xx_lvcmpy_clsf_030;
	}

	public String getXx_lvcmpy_clsf_040(){
		return this.xx_lvcmpy_clsf_040;
	}

	public String getXx_lvcmpy_clsf_050(){
		return this.xx_lvcmpy_clsf_050;
	}

	public String getXx_lvcmpy_clsf_060(){
		return this.xx_lvcmpy_clsf_060;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_LVCMPY_1000_LCURLISTRecord rec = new HD_LVCMPY_1000_LCURLISTRecord();
			rec.cd_type = Util.checkString(rset0.getString("cd_type"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist.add(rec);
		}
		this.xx_lvcmpy_clsf_010 = Util.checkString(cstmt.getString(6));
		this.xx_lvcmpy_clsf_020 = Util.checkString(cstmt.getString(7));
		this.xx_lvcmpy_clsf_030 = Util.checkString(cstmt.getString(8));
		this.xx_lvcmpy_clsf_040 = Util.checkString(cstmt.getString(9));
		this.xx_lvcmpy_clsf_050 = Util.checkString(cstmt.getString(10));
		this.xx_lvcmpy_clsf_060 = Util.checkString(cstmt.getString(11));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_1000_LDataSet ds = (HD_LVCMPY_1000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_1000_LCURLISTRecord curlistRec = (HD_LVCMPY_1000_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_lvcmpy_clsf_010()%>
<%= ds.getXx_lvcmpy_clsf_020()%>
<%= ds.getXx_lvcmpy_clsf_030()%>
<%= ds.getXx_lvcmpy_clsf_040()%>
<%= ds.getXx_lvcmpy_clsf_050()%>
<%= ds.getXx_lvcmpy_clsf_060()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd_type%>
<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 16 14:38:00 KST 2016 */