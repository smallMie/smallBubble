package models;

import java.lang.reflect.Field;

/**
 * 错误码说明
 * 
 * @author zx
 * @date 2014-11-18
 */
public class CodeMsgDesc {

	public String getClassFieldValue(String field) {

		Field tempField;
		String value = null;
		Class className = this.getClass();
		try {
			tempField = className.getDeclaredField(field);
			value = String.valueOf(tempField.get(this));
			return value;
		} catch (NoSuchFieldException e) {
			System.out.println(e);
			return "1";
		} catch (SecurityException e) {
			return "2";
		} catch (IllegalAccessException e) {
			return "3";
		}
	}

	// 公共信息
	public String Code_200 = "成功";
	public String Code_500 = "程序异常，请联系管理员";
	public String Code_400 = "未登录，请先登录";
	
	// 部门报表相关错误码
	public String Code_2001 = "服务器错误，请联系管理员";
	public String Code_2002 = "表格分析失败";
	public String Code_2003 = "仅能上传一个文件";
	public String Code_2004 = "文件个数与需要的不一致";
	public String Code_2005 = "缺少表格";
	public String Code_2006 = "有重复的表格";
	public String Code_2007 = "报表中没有任何有效数据";
	
	public String Code_606010 = "文件读取错误，请重新上传！";
	public String Code_606020 = "文件存储错误，请重新上传！";
	public String Code_606030 = "不允许的文件格式，请重新上传！";

	public String Code_1001 = "用户名或密码错误，请重新输入！";
	public String Code_1002 = "用户名失效，登录失败！";
	public String Code_1003 = "邮箱填写错误，发送邮件失败";
	public String Code_1004 = "输入类别错误";
	public String Code_1005 = "查询数据为空";
	public String Code_1006 = "参数值不能为空";
	public String Code_1007 = "参数错误，请参考API文档";
	public String Code_1008 = "用户名不存在，请先注册！";
	public String Code_1009 = "用户名未激活，请先到注册邮箱激活！";
	public String Code_1010 = "写入失败，请检查后重新输入！";
	public String Code_1011 = "写入失败，请先登录！";
	public String Code_1012 = "该用户尚未关联企业,请先关联企业！";
	public String Code_1013 = "联系人写入失败，请检查后重新输入！";
	public String Code_1014 = "涉及国民经济行业写入失败，请检查后重新输入！";
	public String Code_1015 = "账号尚未通过审核，暂时不能执行当前操作！";
	public String Code_1020 = "涉及高技术领域写入失败，请检查后重新输入！";
	public String Code_1021 = "涉及战略新兴产业写入失败，请检查后重新输入！";
	public String Code_1022 = "涉及产品分类写入失败，请检查后重新输入！";
	public String Code_1017 = "发布失败，请勿重复发布！";
	public String Code_1018 = "更新用户信息失败，请检查后重新输入！";
	public String Code_1019 = "删除失败，请检查后重新删除！";
	public String Code_1023 = "社会化标签写入失败，请检查后重新输入！";
	public String Code_1024 = "用户社会化标签写入失败，请检查后重新输入！";

	public String Code_1030 = "数据合并错误，请重新输入待合并编号！";

	// 单个接口信息
	public String Code_101010 = "该用户名已注册！";
	public String Code_101011 = "密钥生成失败，请重新注册！";
	public String Code_101012 = "激活失败，请重新注册或联系管理员！";
	public String Code_101013 = "该用户已激活，请不要重复操作！";
	public String Code_101014 = "激活链接已失效，请重新发送！";
	public String Code_103010 = "用户名格式错误,请输入手机号或邮箱！";
	public String Code_104010 = "验证码获取失败！";
	public String Code_104020 = "该用户认证邮箱格式错误！";
	public String Code_105010 = "原始密码输入错误，请重新输入！";
	public String Code_604010 = "该企业不存在，请检查后重新输入！";
	public String Code_604011 = "该企业尚未通过审核，不能被认领，请联系管理员！";
	public String Code_604012 = "该高校院所尚未通过审核，不能被认领，请联系管理员！";
	public String Code_604013 = "该专家尚未通过审核，不能被认领，请联系管理员！";
	public String Code_605010 = "产品原材料写入失败，请检查后重新输入！";
	public String Code_605020 = "产品领域写入失败，请检查后重新输入！";
	public String Code_605030 = "产品添加失败，请检查后重新输入！";
	public String Code_605040 = "产品删除失败，请检查后重新输入！";
	public String Code_605050 = "产品涉及领域删除失败，请检查后重新删除！";
	public String Code_605060 = "产品原材料删除失败，请检查后重新删除！";
	public String Code_605070 = "产品标签删除失败，请检查后重新删除！";
	public String Code_605080 = "产品名称已存在，请检查后重新输入！";
	public String Code_605090 = "企业所属行业分类删除失败，请检查后重新删除！";
	public String Code_601310 = "企业经营状况写入失败，请检查后重新输入！";
	public String Code_601410 = "该名称已存在，请检查后重新输入！";
	public String Code_601710 = "高校院所院系写入失败，请检查后重新输入！";
	public String Code_601711 = "高校院所重点学科写入失败，请检查后重新输入！";
	public String Code_601712 = "高校院所重点实验室写入失败，请检查后重新输入！";
	public String Code_601713 = "该高校院所不存在，请检查后重新输入！";
	public String Code_601110 = "专家认证失败，请检查后重新输入！";
	public String Code_601210 = "该专家不存在，请先登录！";
	public String Code_601211 = "专家研究行业写入失败，请检查后重新输入！";
	public String Code_601212 = "删除专家研究行业历史数据错误，请检查后重新删除！";
	public String Code_601213 = "专家学科与国民经济行业映射关系写入失败，请检查后重新输入！";
	public String Code_700410 = "科技成果相关专利添加失败，请检查后重新输入！";
	public String Code_700420 = "科技成果图片添加失败，请检查后重新输入！";
	public String Code_700430 = "科技成果成熟度证明材料添加失败，请检查后重新输入！";
	public String Code_700440 = "科技成果编号错误，请检查后重新输入！";
	public String Code_700110 = "科技需求编号错误，请检查后重新输入！";

	// app后台管理
	public String Code_11001 = "该便签名称已存在，请重新输入！";
	public String Code_11002 = "该便签不存在，请检查后重新输入！";
	public String Code_11003 = "该标签名称已存在，请重新输入！";
	public String Code_11004 = "该标签不存在，请检查后重新输入！";
	public String Code_11005 = "标签名输入为空，请检查后重新输入！";
	public String Code_11006 = "属性名已存在，请检查后重新输入！";
	public String Code_11007 = "该属性名不存在，请检查后重新输入！";
	public String Code_1101010 = "便签名输入为空，请重新输入！";
	public String Code_1104010 = "尚未添加便签！";
	public String Code_1107010 = "标签名输入为空，请重新输入！";
	public String Code_1101110 = "尚未添加标签！";
	public String Code_1101510 = "该企业已关联！";
	public String Code_1101520 = "被标注对象类型错误，无法标注！";
	public String Code_1101610 = "该对象标注信息不存在，请检查后重新输入！";
	public String Code_12001 = "该文章标题已存在！";
	public String Code_12002 = "该文章编号不存在！";
	public String Code_1201010 = "获取app推送账号信息失败！";
	public String Code_1201011 = "极光推送服务信息为空！";
	public String Code_1201012 = "连接标签更新服务失败！";
	public String Code_15001 = "权限不够，无法查看该列表！";
	public String Code_1505010 = "该通知所属分组没有关联企业！";
	public String Code_1709010 = "excel文件模板错误，请重新下载模板！";
	public String Code_1709020 = "该分类上传文件已失效，请重新上传以后再修改！";
	public String Code_1709030 = "查询条件错误，检索字段不存在！";
	public String Code_1709040 = "删除数据必须指定标签！";
	public String Code_1709050 = "提交数据内容错误，请刷新后重新填写！";

	public String Code_14001 = "该关键词已存在！";
	public String Code_14002 = "关键词不能为空！";
	public String Code_14003 = "该关键词不存在！";


}
