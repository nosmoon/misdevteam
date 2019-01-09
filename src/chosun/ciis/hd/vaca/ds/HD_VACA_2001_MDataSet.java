/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� :
* �ۼ��� :
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_VACA_2001_MDataSet ds = (HD_VACA_2001_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_caption_visible_010()%>
<%= ds.getXx_caption_height_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 15 11:43:53 KST 2012 */