/***************************************************************************************************
* ���ϸ� : 
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


package chosun.ciis.pl.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList baseballist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1420_LDataSet(){}
	public PL_BAS_1420_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PL_BAS_1420_LBASEBALLISTRecord rec = new PL_BAS_1420_LBASEBALLISTRecord();
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.reg_seq = Util.checkString(rset0.getString("reg_seq"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.meda_clsf = Util.checkString(rset0.getString("meda_clsf"));
			rec.setup_dt = Util.checkString(rset0.getString("setup_dt"));
			rec.basi_yymm = Util.checkString(rset0.getString("basi_yymm"));
			rec.setup_amt = Util.checkString(rset0.getString("setup_amt"));
			rec.dd_clos_yn = Util.checkString(rset0.getString("dd_clos_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.baseballist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_BAS_1420_LDataSet ds = (PL_BAS_1420_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.baseballist.size(); i++){
		PL_BAS_1420_LBASEBALLISTRecord baseballistRec = (PL_BAS_1420_LBASEBALLISTRecord)ds.baseballist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBaseballist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= baseballistRec.reg_dt%>
<%= baseballistRec.reg_seq%>
<%= baseballistRec.dlco_cd%>
<%= baseballistRec.dlco_seq%>
<%= baseballistRec.medi_clsf%>
<%= baseballistRec.meda_clsf%>
<%= baseballistRec.setup_dt%>
<%= baseballistRec.basi_yymm%>
<%= baseballistRec.setup_amt%>
<%= baseballistRec.dd_clos_yn%>
<%= baseballistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 05 19:55:11 KST 2009 */