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


package chosun.ciis.hd.appmt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.rec.*;

/**
 * 
 */


public class HD_APPMT_1016_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_caption_01;
	public String xx_cmpy_cd_01;
	public String xx_colhideen_01;
	public String xx_colhideen_02;

	public HD_APPMT_1016_MDataSet(){}
	public HD_APPMT_1016_MDataSet(String errcode, String errmsg, String xx_caption_01, String xx_cmpy_cd_01, String xx_colhideen_01, String xx_colhideen_02){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_caption_01 = xx_caption_01;
		this.xx_cmpy_cd_01 = xx_cmpy_cd_01;
		this.xx_colhideen_01 = xx_colhideen_01;
		this.xx_colhideen_02 = xx_colhideen_02;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_caption_01(String xx_caption_01){
		this.xx_caption_01 = xx_caption_01;
	}

	public void setXx_cmpy_cd_01(String xx_cmpy_cd_01){
		this.xx_cmpy_cd_01 = xx_cmpy_cd_01;
	}

	public void setXx_colhideen_01(String xx_colhideen_01){
		this.xx_colhideen_01 = xx_colhideen_01;
	}

	public void setXx_colhideen_02(String xx_colhideen_02){
		this.xx_colhideen_02 = xx_colhideen_02;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_caption_01(){
		return this.xx_caption_01;
	}

	public String getXx_cmpy_cd_01(){
		return this.xx_cmpy_cd_01;
	}

	public String getXx_colhideen_01(){
		return this.xx_colhideen_01;
	}

	public String getXx_colhideen_02(){
		return this.xx_colhideen_02;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_caption_01 = Util.checkString(cstmt.getString(5));
		this.xx_cmpy_cd_01 = Util.checkString(cstmt.getString(6));
		this.xx_colhideen_01 = Util.checkString(cstmt.getString(7));
		this.xx_colhideen_02 = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_APPMT_1016_MDataSet ds = (HD_APPMT_1016_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_caption_01()%>
<%= ds.getXx_cmpy_cd_01()%>
<%= ds.getXx_colhideen_01()%>
<%= ds.getXx_colhideen_02()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 08 11:04:13 KST 2012 */