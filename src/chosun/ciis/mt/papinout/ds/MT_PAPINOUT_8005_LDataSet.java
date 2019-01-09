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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_8005_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_8005_LDataSet(){}
	public MT_PAPINOUT_8005_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			MT_PAPINOUT_8005_LCURLIST1Record rec = new MT_PAPINOUT_8005_LCURLIST1Record();
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.msprtdat = Util.checkString(rset0.getString("msprtdat"));
			rec.msfactcd = Util.checkString(rset0.getString("msfactcd"));
			rec.msfactnm = Util.checkString(rset0.getString("msfactnm"));
			rec.msmccd = Util.checkString(rset0.getString("msmccd"));
			rec.msmcnm = Util.checkString(rset0.getString("msmcnm"));
			rec.cccodeval = Util.checkString(rset0.getString("cccodeval"));
			rec.cccdnm = Util.checkString(rset0.getString("cccdnm"));
			rec.prt_clsf = Util.checkString(rset0.getString("prt_clsf"));
			rec.wgpapgyugk = Util.checkString(rset0.getString("wgpapgyugk"));
			rec.wgprtmnsu = Util.checkString(rset0.getString("wgprtmnsu"));
			rec.wgblkmnsu = Util.checkString(rset0.getString("wgblkmnsu"));
			rec.wgcolmnsu = Util.checkString(rset0.getString("wgcolmnsu"));
			rec.msprtbusu = Util.checkString(rset0.getString("msprtbusu"));
			rec.msprtwt = Util.checkString(rset0.getString("msprtwt"));
			rec.mspajijwwt = Util.checkString(rset0.getString("mspajijwwt"));
			rec.msgitapaji = Util.checkString(rset0.getString("msgitapaji"));
			rec.pajibiyul = Util.checkString(rset0.getString("pajibiyul"));
			rec.msavg = Util.checkString(rset0.getString("msavg"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_8005_LDataSet ds = (MT_PAPINOUT_8005_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPINOUT_8005_LCURLIST1Record curlist1Rec = (MT_PAPINOUT_8005_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.gubun%>
<%= curlist1Rec.msprtdat%>
<%= curlist1Rec.msfactcd%>
<%= curlist1Rec.msfactnm%>
<%= curlist1Rec.msmccd%>
<%= curlist1Rec.msmcnm%>
<%= curlist1Rec.cccodeval%>
<%= curlist1Rec.cccdnm%>
<%= curlist1Rec.prt_clsf%>
<%= curlist1Rec.wgpapgyugk%>
<%= curlist1Rec.wgprtmnsu%>
<%= curlist1Rec.wgblkmnsu%>
<%= curlist1Rec.wgcolmnsu%>
<%= curlist1Rec.msprtbusu%>
<%= curlist1Rec.msprtwt%>
<%= curlist1Rec.mspajijwwt%>
<%= curlist1Rec.msgitapaji%>
<%= curlist1Rec.pajibiyul%>
<%= curlist1Rec.msavg%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Sep 24 21:00:17 KST 2009 */