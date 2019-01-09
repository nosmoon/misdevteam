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


package chosun.ciis.hd.prsn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prsn.dm.*;
import chosun.ciis.hd.prsn.rec.*;

/**
 * 
 */


public class HD_PRSN_2006_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_PRSN_2006_LDataSet(){}
	public HD_PRSN_2006_LDataSet(String errcode, String errmsg){
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
			HD_PRSN_2006_LCURLISTRecord rec = new HD_PRSN_2006_LCURLISTRecord();
			rec.annc_clsf = Util.checkString(rset0.getString("annc_clsf"));
			rec.pgm_id = Util.checkString(rset0.getString("pgm_id"));
			rec.pgm_url = Util.checkString(rset0.getString("pgm_url"));
			rec.job_clsf_nm = Util.checkString(rset0.getString("job_clsf_nm"));
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.pgm_nm = Util.checkString(rset0.getString("pgm_nm"));
			rec.pgm_id_tm = Util.checkString(rset0.getString("pgm_id_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_PRSN_2006_LDataSet ds = (HD_PRSN_2006_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_PRSN_2006_LCURLISTRecord curlistRec = (HD_PRSN_2006_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.annc_clsf%>
<%= curlistRec.pgm_id%>
<%= curlistRec.pgm_url%>
<%= curlistRec.job_clsf_nm%>
<%= curlistRec.job_clsf%>
<%= curlistRec.pgm_nm%>
<%= curlistRec.pgm_id_tm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 14 11:20:53 KST 2009 */