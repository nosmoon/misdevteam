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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2550_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_slip_clsf_cd;
	public String xx_slip_clsf_cd_1;
	public String xx_slip_clsf_cd_2;

	public FC_ACCT_2550_MDataSet(){}
	public FC_ACCT_2550_MDataSet(String errcode, String errmsg, String xx_slip_clsf_cd, String xx_slip_clsf_cd_1, String xx_slip_clsf_cd_2){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_slip_clsf_cd = xx_slip_clsf_cd;
		this.xx_slip_clsf_cd_1 = xx_slip_clsf_cd_1;
		this.xx_slip_clsf_cd_2 = xx_slip_clsf_cd_2;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_slip_clsf_cd(String xx_slip_clsf_cd){
		this.xx_slip_clsf_cd = xx_slip_clsf_cd;
	}

	public void setXx_slip_clsf_cd_1(String xx_slip_clsf_cd_1){
		this.xx_slip_clsf_cd_1 = xx_slip_clsf_cd_1;
	}

	public void setXx_slip_clsf_cd_2(String xx_slip_clsf_cd_2){
		this.xx_slip_clsf_cd_2 = xx_slip_clsf_cd_2;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_slip_clsf_cd(){
		return this.xx_slip_clsf_cd;
	}

	public String getXx_slip_clsf_cd_1(){
		return this.xx_slip_clsf_cd_1;
	}

	public String getXx_slip_clsf_cd_2(){
		return this.xx_slip_clsf_cd_2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2550_MCURLISTRecord rec = new FC_ACCT_2550_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist.add(rec);
		}
		this.xx_slip_clsf_cd = Util.checkString(cstmt.getString(6));
		this.xx_slip_clsf_cd_1 = Util.checkString(cstmt.getString(7));
		this.xx_slip_clsf_cd_2 = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2550_MDataSet ds = (FC_ACCT_2550_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2550_MCURLISTRecord curlistRec = (FC_ACCT_2550_MCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_slip_clsf_cd()%>
<%= ds.getXx_slip_clsf_cd_1()%>
<%= ds.getXx_slip_clsf_cd_2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cd%>
<%= curlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 04 09:13:31 KST 2012 */