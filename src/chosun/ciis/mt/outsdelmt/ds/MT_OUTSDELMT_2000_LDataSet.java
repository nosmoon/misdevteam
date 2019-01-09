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


package chosun.ciis.mt.outsdelmt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.outsdelmt.dm.*;
import chosun.ciis.mt.outsdelmt.rec.*;

/**
 * 
 */


public class MT_OUTSDELMT_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_OUTSDELMT_2000_LDataSet(){}
	public MT_OUTSDELMT_2000_LDataSet(String errcode, String errmsg){
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
			MT_OUTSDELMT_2000_LCURLISTRecord rec = new MT_OUTSDELMT_2000_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.aply_yymm = Util.checkString(rset0.getString("aply_yymm"));
			rec.outsd_elmt_clsf = Util.checkString(rset0.getString("outsd_elmt_clsf"));
			rec.outsd_elmt_cd = Util.checkString(rset0.getString("outsd_elmt_cd"));
			rec.outsd_elmt_nm = Util.checkString(rset0.getString("outsd_elmt_nm"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.avg_amt = Util.checkString(rset0.getString("avg_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_OUTSDELMT_2000_LDataSet ds = (MT_OUTSDELMT_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_OUTSDELMT_2000_LCURLISTRecord curlistRec = (MT_OUTSDELMT_2000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.aply_yymm%>
<%= curlistRec.outsd_elmt_clsf%>
<%= curlistRec.outsd_elmt_cd%>
<%= curlistRec.outsd_elmt_nm%>
<%= curlistRec.unit%>
<%= curlistRec.avg_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 01 15:44:29 KST 2009 */