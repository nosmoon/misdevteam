/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.trg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1915_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String team_nm;
	public String part_nm;
	public String area_nm;

	public SE_TRG_1915_SDataSet(){}
	public SE_TRG_1915_SDataSet(String errcode, String errmsg, String team_nm, String part_nm, String area_nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.team_nm = team_nm;
		this.part_nm = part_nm;
		this.area_nm = area_nm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTeam_nm(String team_nm){
		this.team_nm = team_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTeam_nm(){
		return this.team_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.team_nm = Util.checkString(cstmt.getString(7));
		this.part_nm = Util.checkString(cstmt.getString(8));
		this.area_nm = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_TRG_1915_SDataSet ds = (SE_TRG_1915_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeam_nm()%>
<%= ds.getPart_nm()%>
<%= ds.getArea_nm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jul 01 20:44:51 KST 2009 */