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


package chosun.ciis.pl.cls.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.rec.*;

/**
 * 
 */


public class PL_CLS_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_CLS_1610_LDataSet(){}
	public PL_CLS_1610_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PL_CLS_1610_LPTCRLISTRecord rec = new PL_CLS_1610_LPTCRLISTRecord();
			rec.basi_yymm = Util.checkString(rset0.getString("basi_yymm"));
			rec.basi_dt = Util.checkString(rset0.getString("basi_dt"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.clos_pers_emp_no = Util.checkString(rset0.getString("clos_pers_emp_no"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_CLS_1610_LDataSet ds = (PL_CLS_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_CLS_1610_LPTCRLISTRecord ptcrlistRec = (PL_CLS_1610_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPtcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ptcrlistRec.basi_dt%>
<%= ptcrlistRec.clos_yn%>
<%= ptcrlistRec.clos_pers_emp_no%>
<%= ptcrlistRec.incmg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Nov 09 17:27:02 KST 2015 */