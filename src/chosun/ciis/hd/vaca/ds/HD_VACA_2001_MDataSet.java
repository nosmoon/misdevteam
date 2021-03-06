/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 :
* 작성자 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_2001_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_caption_visible_010;
	public String xx_caption_height_010;

	public HD_VACA_2001_MDataSet(){}
	public HD_VACA_2001_MDataSet(String errcode, String errmsg, String xx_caption_visible_010, String xx_caption_height_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_caption_visible_010 = xx_caption_visible_010;
		this.xx_caption_height_010 = xx_caption_height_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_caption_visible_010(String xx_caption_visible_010){
		this.xx_caption_visible_010 = xx_caption_visible_010;
	}

	public void setXx_caption_height_010(String xx_caption_height_010){
		this.xx_caption_height_010 = xx_caption_height_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_caption_visible_010(){
		return this.xx_caption_visible_010;
	}

	public String getXx_caption_height_010(){
		return this.xx_caption_height_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_caption_visible_010 = Util.checkString(cstmt.getString(5));
		this.xx_caption_height_010 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_2001_MDataSet ds = (HD_VACA_2001_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_caption_visible_010()%>
<%= ds.getXx_caption_height_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 15 11:43:53 KST 2012 */