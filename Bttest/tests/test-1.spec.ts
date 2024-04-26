import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  
  await page.goto('https://www.google.com/search?q=soccer+beck&oq=soccer+beck&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDIzOTBqMGo0qAIAsAIB&sourceid=chrome&ie=UTF-8');
  await page.getByRole('link', { name: 'soccer beck soccer beck https' }).click();
  await page.getByRole('link', { name: 'Giày Bóng Đá Puma Future' }).first().click();
  await page.getByRole('button', { name: 'MUA TẠI ĐÂY FREE SHIP' }).click();
  await page.locator('label').filter({ hasText: '39' }).click();
  await page.getByRole('button', { name: 'MUA TẠI ĐÂY FREE SHIP' }).click();
  await page.locator('#updates_106706641').click();
  await page.locator('#updates_106706641').click();
  await page.locator('#updates_106706641').fill('10');
  await page.locator('#updates_106706641').press('Enter');
  await page.getByRole('button', { name: 'Tiếp tục mua hàng' }).click();
  await page.getByRole('link', { name: 'Giỏ hàng (10) sản phẩm' }).click();
  await page.getByRole('link', { name: 'Giỏ hàng (10) sản phẩm' }).click();
  await page.getByRole('link', { name: 'Thanh toán' }).click();
  await page.getByRole('cell', { name: '₫' }).first().click();
  
});