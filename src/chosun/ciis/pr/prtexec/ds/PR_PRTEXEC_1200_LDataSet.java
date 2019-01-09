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


package chosun.ciis.pr.prtexec.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_1200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTEXEC_1200_LDataSet(){}
	public PR_PRTEXEC_1200_LDataSet(String errcode, String errmsg){
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
			PR_PRTEXEC_1200_LCURLISTRecord rec = new PR_PRTEXEC_1200_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.ecnt = Util.checkString(rset0.getString("ecnt"));
			rec.avg_prt_bgn = Util.checkString(rset0.getString("avg_prt_bgn"));
			rec.avg_prt_end = Util.checkString(rset0.getString("avg_prt_end"));
			rec.avg_rmsg = Util.checkString(rset0.getString("avg_rmsg"));
			rec.avg_off_plat = Util.checkString(rset0.getString("avg_off_plat"));
			rec.avg_off_plat_end = Util.checkString(rset0.getString("avg_off_plat_end"));
			rec.avg_qty = Util.checkString(rset0.getString("avg_qty"));
			rec.avg_real_prt_qty = Util.checkString(rset0.getString("avg_real_prt_qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PR_PRTEXEC_1200_LDataSet ds = (PR_PRTEXEC_1200_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PRTEXEC_1200_LCURLISTRecord curlistRec = (PR_PRTEXEC_1200_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.ecnt%>
<%= curlistRec.avg_prt_bgn%>
<%= curlistRec.avg_prt_end%>
<%= curlistRec.avg_rmsg%>
<%= curlistRec.avg_off_plat%>
<%= curlistRec.avg_off_plat_end%>
<%= curlistRec.avg_qty%>
<%= curlistRec.avg_real_prt_qty%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jun 06 18:09:40 KST 2009 */