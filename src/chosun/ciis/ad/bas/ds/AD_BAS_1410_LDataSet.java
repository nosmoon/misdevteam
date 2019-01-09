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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long cnt_advt;
	public long cnt_agn;

	public AD_BAS_1410_LDataSet(){}
	public AD_BAS_1410_LDataSet(String errcode, String errmsg, long cnt_advt, long cnt_agn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cnt_advt = cnt_advt;
		this.cnt_agn = cnt_agn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCnt_advt(long cnt_advt){
		this.cnt_advt = cnt_advt;
	}

	public void setCnt_agn(long cnt_agn){
		this.cnt_agn = cnt_agn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getCnt_advt(){
		return this.cnt_advt;
	}

	public long getCnt_agn(){
		return this.cnt_agn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.cnt_advt = cstmt.getLong(7);
		this.cnt_agn = cstmt.getLong(8);
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			AD_BAS_1410_LCURLISTRecord rec = new AD_BAS_1410_LCURLISTRecord();
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			rec.mchrg_nm = Util.checkString(rset0.getString("mchrg_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.chrg_area = Util.checkString(rset0.getString("chrg_area"));
			rec.hndl_clsf = Util.checkString(rset0.getString("hndl_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BAS_1410_LDataSet ds = (AD_BAS_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1410_LCURLISTRecord curlistRec = (AD_BAS_1410_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCnt_advt()%>
<%= ds.getCnt_agn()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.mchrg_pers%>
<%= curlistRec.mchrg_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.chrg_area%>
<%= curlistRec.hndl_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Dec 02 17:59:53 KST 2011 */