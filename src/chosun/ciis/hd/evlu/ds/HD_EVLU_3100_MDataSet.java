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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_evlu_step_clsf;

	public HD_EVLU_3100_MDataSet(){}
	public HD_EVLU_3100_MDataSet(String errcode, String errmsg, String xx_evlu_step_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_evlu_step_clsf = xx_evlu_step_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_evlu_step_clsf(String xx_evlu_step_clsf){
		this.xx_evlu_step_clsf = xx_evlu_step_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_evlu_step_clsf(){
		return this.xx_evlu_step_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_EVLU_3100_MCURLISTRecord rec = new HD_EVLU_3100_MCURLISTRecord();
			rec.evlu_grad_cd = Util.checkString(rset0.getString("evlu_grad_cd"));
			rec.evlu_grad_nm = Util.checkString(rset0.getString("evlu_grad_nm"));
			this.curlist.add(rec);
		}
		this.xx_evlu_step_clsf = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EVLU_3100_MDataSet ds = (HD_EVLU_3100_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_3100_MCURLISTRecord curlistRec = (HD_EVLU_3100_MCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_evlu_step_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.evlu_grad_cd%>
<%= curlistRec.evlu_grad_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 21 16:01:50 KST 2012 */