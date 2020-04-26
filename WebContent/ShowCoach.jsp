<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" href="/Gymnasium/css/ShowCoach.css" />
	</head>
	<body>
		
		<div class="private">
			<img src="${img}" >
			<ul>
				<li><h2>姓名:${coach.c_name}</h2></li>
				<li><h2>性别:${coach.c_sex }</h2></li>
			</ul>
			
			
		</div>
		<div class="private_1">
			<div class="">
				<h2>个人展示</h2>
				<h2>擅长项目:${coach.c_p_id}</h2>
			</div>
			
			
		</div>
		<div class="service_bg">
			<div class="service">
				<h2>便于更好服务您</h2>
				<p>如果您对我们的会所感兴趣，请留下您的信息。</p>
				<div class="selectlist">
					<div class="form-group">
						<div class="list">
							<span class="zcity">请选择</span>
							<select class="zcitylist" id="userProvince"><option value="">全部</option><option value="上海市">上海市</option><option value="北京市">北京市</option><option value="深圳市">深圳市</option><option value="广州市">广州市</option><option value="杭州市">杭州市</option></select>
						</div>
					</div>
					<div class="form-group">
						<div class="list">
							<span class="zcity" id="myCity">全部</span>
							<select class="zcitylist" id="userCity">
							</select>
						</div>
					</div>
					<div class="form-group">
						<div class="list">
							<span class="zcity" id="myClub">全部</span>
							<select class="zcitylist" id="userClub">
							</select>
						</div>
					</div>
				</div>
				<div class="inp">
					<span>姓名：</span>
					<input type="text" id="userName"></div>
				<div class="inp">
					<span>电话：</span>
					<input type="text" id="userPhone">
					<strong class="tip" style="font-size: 16px;">请输入正确的手机号</strong>
				</div>
				<button class="btn" id="submit">提交</button>
			</div>
	</div>		
	
	</body>
</html>
