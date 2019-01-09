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


package chosun.ciis.mt.submatrout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 *
 */


public class MT_SUBMATROUT_1301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_1301_LDataSet(){}
	public MT_SUBMATROUT_1301_LDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_SUBMATROUT_1301_LCURLISTRecord rec = new MT_SUBMATROUT_1301_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.owh_dept = Util.checkString(rset1.getString("owh_dept"));
			rec.sum_qunt = Util.checkString(rset1.getString("sum_qunt"));
			rec.avg_cgdan = Util.checkString(rset1.getString("avg_cgdan"));
			rec.sum_amt = Util.checkString(rset1.getString("sum_amt"));
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			rec.owh_dept_nm = Util.checkString(rset1.getString("owh_dept_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_SUBMATROUT_1301_LDataSet ds = (MT_SUBMATROUT_1301_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_1301_LCURLISTRecord curlistRec = (MT_SUBMATROUT_1301_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.fac_clsf%>
<%= curlistRec.matr_cd%>
<%= curlistRec.owh_dept%>
<%= curlistRec.sum_qunt%>
<%= curlistRec.avg_cgdan%>
<%= curlistRec.sum_amt%>
<%= curlistRec.matr_nm%>
<%= curlistRec.owh_dept_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 23 20:59:44 KST 2009 */