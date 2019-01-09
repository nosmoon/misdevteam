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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1004_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1004_SDataSet(){}
	public AS_ASET_1004_SDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AS_ASET_1004_SCURLISTRecord rec = new AS_ASET_1004_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.land_plcw = Util.checkString(rset0.getString("land_plcw"));
			rec.acqr_land_amt = Util.checkString(rset0.getString("acqr_land_amt"));
			rec.acqr_yymm = Util.checkString(rset0.getString("acqr_yymm"));
			rec.now_land_amt = Util.checkString(rset0.getString("now_land_amt"));
			rec.now_yymm = Util.checkString(rset0.getString("now_yymm"));
			rec.land_usag = Util.checkString(rset0.getString("land_usag"));
			rec.rela_aset_no = Util.checkString(rset0.getString("rela_aset_no"));
			rec.rela_aset_nm = Util.checkString(rset0.getString("rela_aset_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AS_ASET_1004_SDataSet ds = (AS_ASET_1004_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1004_SCURLISTRecord curlistRec = (AS_ASET_1004_SCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.aset_no%>
<%= curlistRec.land_plcw%>
<%= curlistRec.acqr_land_amt%>
<%= curlistRec.acqr_yymm%>
<%= curlistRec.now_land_amt%>
<%= curlistRec.now_yymm%>
<%= curlistRec.land_usag%>
<%= curlistRec.rela_aset_no%>
<%= curlistRec.rela_aset_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 03 14:30:09 KST 2009 */