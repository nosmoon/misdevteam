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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1059_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_1059_LDataSet(){}
	public SE_BOI_1059_LDataSet(String errcode, String errmsg){
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
			SE_BOI_1059_LCURLISTRecord rec = new SE_BOI_1059_LCURLISTRecord();
			rec.chg_seq = Util.checkString(rset0.getString("chg_seq"));
			rec.chg_prv_bo_nm = Util.checkString(rset0.getString("chg_prv_bo_nm"));
			rec.chg_aft_bo_nm = Util.checkString(rset0.getString("chg_aft_bo_nm"));
			rec.incmg_pers_ip = Util.checkString(rset0.getString("incmg_pers_ip"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BOI_1059_LDataSet ds = (SE_BOI_1059_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_1059_LCURLISTRecord curlistRec = (SE_BOI_1059_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chg_seq%>
<%= curlistRec.chg_prv_bo_nm%>
<%= curlistRec.chg_aft_bo_nm%>
<%= curlistRec.incmg_pers_ip%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Aug 30 17:47:47 KST 2009 */