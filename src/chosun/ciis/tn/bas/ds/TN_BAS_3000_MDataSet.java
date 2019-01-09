/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_3000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_combo_020 = new ArrayList();
	public ArrayList xx_combo_030 = new ArrayList();
	public ArrayList xx_combo_040 = new ArrayList();
	public ArrayList xx_combo_010 = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_BAS_3000_MDataSet(){}
	public TN_BAS_3000_MDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			TN_BAS_3000_MXX_COMBO_010Record rec = new TN_BAS_3000_MXX_COMBO_010Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			this.xx_combo_010.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			TN_BAS_3000_MXX_COMBO_020Record rec = new TN_BAS_3000_MXX_COMBO_020Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			this.xx_combo_020.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			TN_BAS_3000_MXX_COMBO_030Record rec = new TN_BAS_3000_MXX_COMBO_030Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			this.xx_combo_030.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			TN_BAS_3000_MXX_COMBO_040Record rec = new TN_BAS_3000_MXX_COMBO_040Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cd_nm = Util.checkString(rset3.getString("cd_nm"));
			this.xx_combo_040.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_BAS_3000_MDataSet ds = (TN_BAS_3000_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.xx_combo_010.size(); i++){
		TN_BAS_3000_MXX_COMBO_010Record xx_combo_010Rec = (TN_BAS_3000_MXX_COMBO_010Record)ds.xx_combo_010.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.xx_combo_020.size(); i++){
		TN_BAS_3000_MXX_COMBO_020Record xx_combo_020Rec = (TN_BAS_3000_MXX_COMBO_020Record)ds.xx_combo_020.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.xx_combo_030.size(); i++){
		TN_BAS_3000_MXX_COMBO_030Record xx_combo_030Rec = (TN_BAS_3000_MXX_COMBO_030Record)ds.xx_combo_030.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.xx_combo_040.size(); i++){
		TN_BAS_3000_MXX_COMBO_040Record xx_combo_040Rec = (TN_BAS_3000_MXX_COMBO_040Record)ds.xx_combo_040.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_combo_010()%>
<%= ds.getXx_combo_020()%>
<%= ds.getXx_combo_030()%>
<%= ds.getXx_combo_040()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= xx_combo_010Rec.cd%>
<%= xx_combo_010Rec.cd_nm%>
<%= xx_combo_020Rec.cd%>
<%= xx_combo_020Rec.cd_nm%>
<%= xx_combo_030Rec.cd%>
<%= xx_combo_030Rec.cd_nm%>
<%= xx_combo_040Rec.cd%>
<%= xx_combo_040Rec.cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 18 15:10:55 KST 2016 */