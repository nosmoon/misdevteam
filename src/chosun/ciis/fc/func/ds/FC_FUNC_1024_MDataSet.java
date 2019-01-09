/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1024_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_cd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_stat_cd;
	public String xx_now_note_stat_cd;

	public FC_FUNC_1024_MDataSet(){}
	public FC_FUNC_1024_MDataSet(String errcode, String errmsg, String xx_stat_cd, String xx_now_note_stat_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_stat_cd = xx_stat_cd;
		this.xx_now_note_stat_cd = xx_now_note_stat_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_stat_cd(String xx_stat_cd){
		this.xx_stat_cd = xx_stat_cd;
	}

	public void setXx_now_note_stat_cd(String xx_now_note_stat_cd){
		this.xx_now_note_stat_cd = xx_now_note_stat_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_stat_cd(){
		return this.xx_stat_cd;
	}

	public String getXx_now_note_stat_cd(){
		return this.xx_now_note_stat_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_1024_MXX_CDRecord rec = new FC_FUNC_1024_MXX_CDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.xx_cd.add(rec);
		}
		this.xx_stat_cd = Util.checkString(cstmt.getString(6));
		this.xx_now_note_stat_cd = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1024_MDataSet ds = (FC_FUNC_1024_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.xx_cd.size(); i++){
		FC_FUNC_1024_MXX_CDRecord xx_cdRec = (FC_FUNC_1024_MXX_CDRecord)ds.xx_cd.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_cd()%>
<%= ds.getXx_stat_cd()%>
<%= ds.getXx_now_note_stat_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= xx_cdRec.cd_nm%>
<%= xx_cdRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jan 03 14:48:31 KST 2012 */