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


package chosun.ciis.hd.orga.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.rec.*;

/**
 * 
 */


public class HD_ORGA_1400_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String level_cnt;

	public HD_ORGA_1400_LDataSet(){}
	public HD_ORGA_1400_LDataSet(String errcode, String errmsg, String level_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.level_cnt = level_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setLevel_cnt(String level_cnt){
		this.level_cnt = level_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getLevel_cnt(){
		return this.level_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_ORGA_1400_LCURLISTRecord rec = new HD_ORGA_1400_LCURLISTRecord();
			rec.lvl = Util.checkString(rset0.getString("lvl"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.insd_dept_cd = Util.checkString(rset0.getString("insd_dept_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			this.curlist.add(rec);
		}
		this.level_cnt = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_ORGA_1400_LDataSet ds = (HD_ORGA_1400_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_ORGA_1400_LCURLISTRecord curlistRec = (HD_ORGA_1400_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getLevel_cnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.lvl%>
<%= curlistRec.dept_nm%>
<%= curlistRec.insd_dept_cd%>
<%= curlistRec.dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 25 20:44:09 KST 2009 */