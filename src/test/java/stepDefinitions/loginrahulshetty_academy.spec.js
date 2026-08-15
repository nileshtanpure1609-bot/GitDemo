const {test, expect} = require('@playwright/test');


test (' rahulshetty login test', async ({page})=>

{
 //const context = await browser.newContext();
 //const page = context.newPage();
const cardtitles = await page.locator(".card-body a");
await page.goto("https://rahulshettyacademy.com/loginpagePractise/");
await page.locator("#username").fill("rahulshettyacademy");
await page.locator("#password").fill("Learning@830$3mK2");
await page.locator("#signInBtn").click();
